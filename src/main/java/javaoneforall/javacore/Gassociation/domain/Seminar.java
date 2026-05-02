package javaoneforall.javacore.Gassociation.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;


    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Student[] student, Place place) {
        this.title = title;
        this.students = student;
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
