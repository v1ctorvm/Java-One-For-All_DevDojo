package javaoneforall.javacore.ZZHdesignpatterns.domain;

public class Person {
    private String name;
    private String lastName;
    private String userName;
    private String email;

    private Person(String name, String lastName, String userName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static final class PersonBuilder {
        private String name;
        private String lastName;
        private String userName;
        private String email;

        private PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(name, lastName, userName, email);
        }
    }

    public String getName() {
        return name;
    }
}
