package javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    static void main() throws IOException {

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);){
            fw.write("This is a message from Victor for you!\nThis is a new nice line!\n");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
