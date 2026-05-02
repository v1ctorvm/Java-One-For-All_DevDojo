package javaoneforall.javacore.Xserialization.test;

import javaoneforall.javacore.Xserialization.domain.Seminar;
import javaoneforall.javacore.Xserialization.domain.Student;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    static void main() {

        Student student = new Student(1L, "Victor Matheus", "123456789");
        Seminar seminar = new Seminar("Special Seminar From DevDojo");
        student.setSeminar(seminar);

        serialize(student);
        deserialize();


    }

    private static void serialize(Student student) {

        Path path = Paths.get("folder/student.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() {
        Path path = Paths.get("folder/student.ser");

        try (ObjectInput ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
