package javaoneforall.javacore.Oexeption.exeption.test;

import javaoneforall.javacore.Oexeption.exeption.domain.Reader1;
import javaoneforall.javacore.Oexeption.exeption.domain.Reader2;

import java.io.*;

public class TryWithResoursesTest01 {
    static void main() {
        readFile1();


    }

    private static void readFile1(){
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()){

        } catch (IOException e){

        }
    }


        private static void readFile2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
