package javaoneforall.javacore.Npolymorphism.test;

import javaoneforall.javacore.Npolymorphism.repository.Repository;
import javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;

public class RepositoryTest01 {
    static void main() {

        Repository repository = new DatabaseRepositoryService();
        repository.save();
    }
}
