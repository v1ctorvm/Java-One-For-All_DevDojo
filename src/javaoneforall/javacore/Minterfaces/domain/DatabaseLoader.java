package javaoneforall.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }


    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieve MAX_DATA_SIZE in the class DatabaseLoader");
    }
}

