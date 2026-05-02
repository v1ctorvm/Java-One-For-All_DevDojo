package javaoneforall.javacore.Vio.test;

import java.io.*;

public class BufferReaderTest01 {
    static void main() throws FileNotFoundException {
        File file = new File("file.txt");

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
