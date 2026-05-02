package javaoneforall.javacore.Oexeption.exeption.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Cloasing reader1");
    }
}
