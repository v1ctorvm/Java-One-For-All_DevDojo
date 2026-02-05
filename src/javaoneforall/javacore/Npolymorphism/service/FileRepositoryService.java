package javaoneforall.javacore.Npolymorphism.service;

import javaoneforall.javacore.Npolymorphism.repository.Repository;

public class FileRepositoryService implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in a file");
    }
}
