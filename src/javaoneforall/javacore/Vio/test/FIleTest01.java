package javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FIleTest01 {
    static void main() {

        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("isCreated = " + isCreated);
            System.out.println("Exists: " + file.exists());

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println("isDirectory " + file.isDirectory());
            System.out.println("isHidden " + file.isHidden());
            System.out.println("Last Modified " + new Date(file.lastModified()));


            if (file.exists()){
                boolean isDeleted = file.delete();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
