package javaoneforall.javacore.ZZIddbc.test;

import javaoneforall.javacore.ZZIddbc.domain.Producer;
import javaoneforall.javacore.ZZIddbc.repository.ProducerRepository;

import java.util.List;

public class ConnectionFactoryTest03 {
    static void main() {

        Producer producer1 = Producer.builder().name("Toei Animation").build();
        Producer producer2 = Producer.builder().name("White Fox").build();
        Producer producer3 = Producer.builder().name("Studio Ghibli").build();


        ProducerRepository.saveTransaction(List.of(producer1,producer2,producer3));


    }
}
