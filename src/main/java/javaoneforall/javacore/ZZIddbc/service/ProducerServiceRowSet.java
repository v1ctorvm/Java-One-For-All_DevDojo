package javaoneforall.javacore.ZZIddbc.service;

import javaoneforall.javacore.ZZIddbc.domain.Producer;
import javaoneforall.javacore.ZZIddbc.repository.ProcuerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameRowSet(String name){
        return ProcuerRepositoryRowSet.findByNameJdbcRowSet(name);
    }
}
