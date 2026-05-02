package javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    static void main() throws FileNotFoundException {
        File file = new File("file.txt");

        try (FileReader reader = new FileReader(file)) {
//            char[] in = new char[100];
//            int read = reader.read(in);
//
//            for (char c : in) {
//                System.out.print(c);
//            }

            int i;
            while((i = reader.read()) != -1){
                System.out.print((char)i);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
