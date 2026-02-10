package javaoneforall.javacore.Vio.test;

import java.io.*;

public class BufferTwitterTest01 {
    static void main() {

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bf = new BufferedWriter(fw)){
            bf.write("This is a message from Victor for you!");
            bf.newLine();
            bf.write("This is a new nice line!");

            bf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
