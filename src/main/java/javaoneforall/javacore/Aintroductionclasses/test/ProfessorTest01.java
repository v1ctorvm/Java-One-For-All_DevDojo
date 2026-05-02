package javaoneforall.javacore.Aintroductionclasses.test;

import javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    static void main() {

        Professor professor = new Professor();
        professor.name = "Neuza";
        professor.age = 48;
        professor.gender = 'F';

        System.out.println("Name: " + professor.name + " | Age: " + professor.age + " | Gender "+ professor.gender);
    }
}
