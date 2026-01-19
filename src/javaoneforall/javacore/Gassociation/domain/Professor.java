package javaoneforall.javacore.Gassociation.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name, String searchField) {
        this.name = name;
        this.researchField = searchField;
    }

    public Professor(String name, String searchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = searchField;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("--------");
        System.out.println("Professor Name: " + this.name + " Research Field: " + this.researchField);
        if (seminars == null) return;
        System.out.println("######");
        for (Seminar seminar : seminars) {
            System.out.println("Seminar Title: " + seminar.getTitle());
            System.out.println("Happening at:  " + seminar.getPlace().getAdress());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) continue;
            System.out.println("********");
            for (Student student : seminar.getStudents()) {
                System.out.println("Sutend Name: " + student.getName() + " Age: " + student.getAge());
            }

        }

    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
