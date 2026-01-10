package javaoneforall.javacore.Aintroductionclasses.test;

import javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    static void main() {


        Student student = new Student();

        student.age = 21;
        student.name = "Luffy";
        student.gender = 'M';

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.gender);

    }
}
