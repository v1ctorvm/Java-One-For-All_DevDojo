package javaoneforall.javacore.Minterfaces.test;

import javaoneforall.javacore.Minterfaces.domain.DataLoader;
import javaoneforall.javacore.Minterfaces.domain.DatabaseLoader;
import javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main() {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DatabaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
    }
}
