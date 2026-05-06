package javaoneforall.javacore.ZZIddbc.test;

import javaoneforall.javacore.ZZIddbc.conn.ConnectionFactory;
import javaoneforall.javacore.ZZIddbc.domain.Producer;
import javaoneforall.javacore.ZZIddbc.repository.ProducerRepository;
import javaoneforall.javacore.ZZIddbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {


        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerUpdated = Producer.builder().name("MADHOUSE").id(1).build();

//        List<Producer> producers = ProducerService.findByName("");


        ProducerService.showDriverMetaData();



    }
}
