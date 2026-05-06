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
}
