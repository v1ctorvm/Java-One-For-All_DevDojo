package javaoneforall.javacore.ZZJcrud.repository;

import javaoneforall.javacore.ZZJcrud.conn.ConnectionFactory;
import javaoneforall.javacore.ZZJcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name) {

        log.info("Finding producer by name '{}'", name);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error trying to find producers by name", e);
        }

        return producers;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }


    public static void delete(Integer id) {

        log.info("Deleting producer by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {

            ps.execute();

        } catch (SQLException e) {
            log.error("Error trying to delete producer by id", e);
        }

    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM  anime_store.producer WHERE (id = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static void save(Producer producer) {
        log.info("Saving producer '{}", producer.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error trying to save producer", e);
        }

    }

    private static PreparedStatement createPrepareStementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES (?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, producer.getName());

        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producer by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) return Optional.empty();

            return Optional.of(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build()
            );


        } catch (SQLException e) {
            log.error("Error trying to find producer by id", id);
        }

        return Optional.empty();
    }

    public static void update(Producer producer){

        log.info("Updating producer '{}'",producer);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn,producer)){

            ps.execute();
        } catch (SQLException e){
            log.error("Error white trying to update producer with id '{}'",producer.getId(),e);
        }

    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Producer producer) throws SQLException {

        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,producer.getName());
        ps.setInt(2,producer.getId());
        return ps;
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


}
