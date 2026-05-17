package javaoneforall.javacore.ZZIddbc.test;

import javaoneforall.javacore.ZZIddbc.domain.Producer;
import javaoneforall.javacore.ZZIddbc.repository.ProcuerRepositoryRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    static void main() {

        List<Producer> producers = ProcuerRepositoryRowSet.findByNameJdbcRowSet("map");
        log.info(producers);


    }
}
