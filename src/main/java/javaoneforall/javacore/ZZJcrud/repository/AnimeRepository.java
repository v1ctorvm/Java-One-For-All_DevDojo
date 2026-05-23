package javaoneforall.javacore.ZZJcrud.repository;

import javaoneforall.javacore.ZZJcrud.conn.ConnectionFactory;
import javaoneforall.javacore.ZZJcrud.domain.Anime;
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
public class AnimeRepository {

    public static List<Anime> findByName(String name) {

        log.info("Finding anime by name '{}'", name);

        List<Anime> animes = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()){

                Producer producer = Producer.builder()
                        .id(rs.getInt("producer_id"))
                        .name("producer_name")
                        .build();

                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();

                animes.add(anime);

            }

        } catch (SQLException e) {
            log.error("Error trying to find animes by name", e);
        }

        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, p.id as 'producer_id', p.name as 'producer_name' FROM anime_store.anime a
                inner join anime_store.producer p on a.producer_id = p.id where a.name like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }


    public static void delete(Integer id) {

        log.info("Deleting anime by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {

            ps.execute();

        } catch (SQLException e) {
            log.error("Error trying to delete anime by id", e);
        }

    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM  anime_store.anime WHERE (id = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }


    public static void save(Anime anime) {
        log.info("Saving anime '{}", anime.getName());

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStementSave(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error trying to save anime", e);
        }

    }

    private static PreparedStatement createPrepareStementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime_store.anime (name,episodes,producer_id) VALUES (?,?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId()); ;

        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding anime by id '{}'", id);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) return Optional.empty();

            Producer producer = Producer.builder().id(rs.getInt("producer_id"))
                    .name(rs.getString("producer_name"))
                    .build();

            return Optional.of(Anime.builder()
                    .id(rs.getInt("id"))
                    .id(rs.getInt("episodes"))
                    .name(rs.getString("name"))
                    .producer(producer)
                    .build()
            );


        } catch (SQLException e) {
            log.error("Error trying to find anime by id", id);
        }

        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, p.id as 'producer_id', p.name as 'producer_name' FROM anime_store.anime a
                inner join anime_store.producer p on a.producer_id = p.id where a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(Anime anime){

        log.info("Updating anime '{}'",anime);

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementUpdate(conn,anime)){

            ps.execute();
        } catch (SQLException e){
            log.error("Error white trying to update anime with id '{}'",anime.getId(),e);
        }

    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Anime anime) throws SQLException {

        String sql = "UPDATE `anime_store`.`anime` SET `name` = ? , episodes = ? WHERE (`id` = ?);";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,anime.getName());
        ps.setInt(2,anime.getEpisodes());
        ps.setInt(3,anime.getId());
        return ps;
    }

}
