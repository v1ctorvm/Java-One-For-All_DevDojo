package javaoneforall.javacore.ZZIddbc.repository;

import javaoneforall.javacore.ZZIddbc.conn.ConnectionFactory;
import javaoneforall.javacore.ZZIddbc.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
}
