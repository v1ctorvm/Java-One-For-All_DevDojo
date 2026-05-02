package javaoneforall.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main() throws IOException {

        File fileFolder = new File("folder");
        boolean isFolderCreated = fileFolder.mkdir();
        System.out.println("Is folder created: " + isFolderCreated);

        //File file = new File("/Users/victormatheus/IdeaProjects/Java-One-For-All_DevDojo/folder/file.txt");

        File file = new File(fileFolder,"file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("Is File Created: " + isFileCreated);

        File fileRenamed = new File(fileFolder,"file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println("isFileRenamed = " + isFileRenamed);

        File fileFolderRenamed = new File("fileFolder2");
        boolean b = fileFolder.renameTo(fileFolderRenamed);
        System.out.println(b);


    }
}
