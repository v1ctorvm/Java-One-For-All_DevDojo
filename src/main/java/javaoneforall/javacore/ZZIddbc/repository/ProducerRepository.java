package javaoneforall.javacore.ZZIddbc.repository;

import javaoneforall.javacore.ZZIddbc.conn.ConnectionFactory;
import javaoneforall.javacore.ZZIddbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer){

         String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());


        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()){

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inseted producer '{}'. Affected rows in the database `'{}'",producer.getName(),rowsAffected);

        } catch (SQLException e){
            log.error("Error white trying to insert producer '{}'",producer.getName(),e);
        }

    }

    public static void saveTransaction(List<Producer> producers) {

        try (Connection conn = ConnectionFactory.getConnection()){
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn,producers);
            conn.commit();


        } catch (SQLException e) {
            log.error("Error white trying to update producers '{}'", producers, e);
        }

    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {

        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";

        boolean shouldRollback = false;

        for (Producer p : producers) {

            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, p.getName());
                ps.execute();
            } catch (Exception e){
                e.printStackTrace();
                shouldRollback = true;
            }
        }

        if (shouldRollback){
            log.warn("Transactions is going to be rollback, failed to insert producers '{}'",producers);
            conn.rollback();
        }
    }

    public static void delete(int id){

         String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);


        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()){

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer with id '{}'. Affected rows in the database '{}'",id,rowsAffected);

        } catch (SQLException e){
            log.error("Error white trying to delete producer with id '{}'",id,e);
        }

    }

    public static void update(Producer producer){

         String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(),producer.getId());


        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()){

            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer with id '{}'. Affected rows in the database '{}'",producer.getId(),rowsAffected);

        } catch (SQLException e){
            log.error("Error white trying to update producer with id '{}'",producer.getId(),e);
        }

    }

    public static void updatePreparedStatement(Producer producer){

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(conn,producer)){

            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer with id '{}'. Affected rows in the database '{}'",producer.getId(),rowsAffected);

        } catch (SQLException e){
            log.error("Error white trying to update producer with id '{}'",producer.getId(),e);
        }

    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {

        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,producer.getName());
        ps.setInt(2,producer.getId());
        return ps;
    }


    public static List<Producer> findAll(){
        return findByName("");
    }


    public static List<Producer> findByName(String name){

        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%';"
                .formatted(name);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){

                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

            return producers;
        } catch (SQLException e){
            log.error("Error white trying to find all producers",e);
        }

        return producers;
    }

    public static List<Producer> findByNamePreparedStatement(String name) {



        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn,name);
             ResultSet rs = ps.executeQuery()) {


            while (rs.next()) {

                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

            return producers;
        } catch (SQLException e) {
            log.error("Error white trying to find all producers", e);
        }

        return producers;
    }
    public static List<Producer> findByNameCallableStatement(String name) {



        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn,name);
             ResultSet rs = ps.executeQuery()) {


            while (rs.next()) {

                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

            return producers;
        } catch (SQLException e) {
            log.error("Error white trying to find all producers", e);
        }

        return producers;
    }

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {

        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"%"+name+"%");
        return ps;
    }
    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {

        String sql = "CALL `anime_store`.`sp_get_producer_by_name`(?);";


        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1,"%"+name+"%");
        return cs;
    }

    public static void showResultSetMetaData(){

        String sql = "SELECT * FROM anime_store.producer;";


        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Column count '{}'",columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name '{}'",metaData.getTableName(i));
                log.info("Column name '{}'",metaData.getColumnName(i));
                log.info("Column size '{}'",metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'",metaData.getColumnTypeName(i));
            }


        } catch (SQLException e){
            log.error("Error white trying to find all producers",e);
        }

    }

    public static void showDriverMetaData(){

        try (Connection conn = ConnectionFactory.getConnection()){

            DatabaseMetaData dbMetaData = conn.getMetaData();

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Sopports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY ,ResultSet.CONCUR_UPDATABLE)){
                    log.info("Sopports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Sopports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE ,ResultSet.CONCUR_UPDATABLE)){
                    log.info("Sopports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Sopports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE ,ResultSet.CONCUR_UPDATABLE)){
                    log.info("Sopports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e){
            log.error("Error white trying to find all producers",e);
        }
    }


    public static void showTypeScrollWorking(){

        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)){


            log.info("Last row: '{}",rs.last());
            log.info("Row Number: '{}",rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("---------------------");

            log.info("First row: '{}",rs.first());
            log.info("Row Number: '{}",rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("---------------------");

            log.info("Absolute row: '{}",rs.absolute(2));
            log.info("Row Number: '{}",rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("---------------------");

            log.info("Relative row: '{}",rs.relative(-1));
            log.info("Row Number: '{}",rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("---------------------");

            log.info("Is Last row: '{}",rs.isLast());
            log.info("Row Number: '{}",rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("---------------------");

            log.info("Is First row: '{}",rs.isFirst());
            log.info("Row Number: '{}",rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("---------------------");

            log.info("After Last row: '{}",rs.last());
            log.info("Row Number: '{}",rs.getRow());
            rs.afterLast();

            while(rs.previous()){
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }



        } catch (SQLException e){
            log.error("Error white trying to find all producers",e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%';"
                .formatted(name);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();

                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                producers.add(producer);
            }

            return producers;
        } catch (SQLException e) {
            log.error("Error white trying to find all producers", e);
        }

        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%';"
                .formatted(name);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) return producers;

            insertNewProucer(name, rs);


            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error white trying to find all producers", e);
        }

        return producers;
    }

    public static List<Producer> findByNameAndDelete(String name) {

        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%';"
                .formatted(name);

        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error white trying to find all producers", e);
        }

        return producers;
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();

        return Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
    }

    private static void insertNewProucer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }
}
