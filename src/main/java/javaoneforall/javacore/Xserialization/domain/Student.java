package javaoneforall.javacore.Xserialization.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private Long ID;
    private String name;
    private transient String password; // Nao serializer e nao ler
    private static final long serialVersionUid = 5977413159017357031L;
    private transient Seminar seminar;
    private static String SCHOOL_NAME = " DEVE DOJO";



    public Student(Long ID, String name, String password) {
        this.ID = ID;
        this.name = name;
        this.password = password;
    }

    private void writeObjetc(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(seminar.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObjetc(ObjectInputStream ois) {
        try {

            ois.defaultReadObject();
            String seminarName = ois.readUTF();

            this.seminar = new Seminar(seminarName);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public Student() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                " Seminar = " + seminar + '\'' +
                " School = " + SCHOOL_NAME + '\'' +
                '}';
    }
}
