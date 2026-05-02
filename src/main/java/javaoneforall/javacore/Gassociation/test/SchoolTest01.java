package javaoneforall.javacore.Gassociation.test;

import javaoneforall.javacore.Gassociation.domain.Professor;
import javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    static void main() {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor,professor2};
        School school = new School("Konoha",professors);

        school.print();
    }
}
