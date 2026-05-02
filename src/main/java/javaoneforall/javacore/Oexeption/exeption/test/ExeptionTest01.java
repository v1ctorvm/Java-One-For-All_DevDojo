package javaoneforall.javacore.Oexeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    static void main() {
    customFileCreator();
    }

    private static void customFileCreator(){
        File file = new File("/Users/victormatheus/IdeaProjects/Java-One-For-All_DevDojo/src/folder/test2.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
