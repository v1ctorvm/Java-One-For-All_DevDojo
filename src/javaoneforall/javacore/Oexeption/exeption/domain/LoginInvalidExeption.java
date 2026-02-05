package javaoneforall.javacore.Oexeption.exeption.domain;

public class LoginInvalidExeption extends Exception{
    public LoginInvalidExeption() {
        super("Invalid Login");
    }

    public LoginInvalidExeption(String message) {
        super(message);
    }
}
