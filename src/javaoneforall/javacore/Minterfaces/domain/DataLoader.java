package javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    // public and abstract default
    public abstract void load();

    public final int MAX_DATA_SIZE = 10;

    public default void checkPermission(){
        System.out.println("Cheking Permission General");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieve MAX_DATA_SIZE in the interface");
    }
}
