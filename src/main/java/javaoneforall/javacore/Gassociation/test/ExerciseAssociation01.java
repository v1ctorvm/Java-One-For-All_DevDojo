package javaoneforall.javacore.Gassociation.test;

import javaoneforall.javacore.Gassociation.domain.Place;
import javaoneforall.javacore.Gassociation.domain.Professor;
import javaoneforall.javacore.Gassociation.domain.Seminar;
import javaoneforall.javacore.Gassociation.domain.Student;

public class ExerciseAssociation01 {
    static void main() {

        Place place = new Place("5th Av");

        Student student = new Student("Luffy", 17);
        Student student2 = new Student("Nami", 18);
        Student[] seminarStudents = {student,student2};

        Seminar seminar = new Seminar("Finding One Piece", seminarStudents,place);
        Seminar[] avaliableSeminars = {seminar};

        Professor professor = new Professor("White Beard", "Pirates",avaliableSeminars);


        professor.print();
    }
}
