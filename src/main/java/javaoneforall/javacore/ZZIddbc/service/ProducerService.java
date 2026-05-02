package javaoneforall.javacore.ZZIddbc.service;

import javaoneforall.javacore.ZZIddbc.domain.Producer;
import javaoneforall.javacore.ZZIddbc.repository.ProducerRepository;

public class ProducerService {

    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){
        requireValidId(id);
        ProducerRepository.delete(id);
    }


    public static void update(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    private static void requireValidId(Integer id){
        if (id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value passed to id, is it bigger than 0?");
        }
    }

}
