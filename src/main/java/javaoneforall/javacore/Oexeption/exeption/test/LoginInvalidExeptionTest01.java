package javaoneforall.javacore.Oexeption.exeption.test;

import javaoneforall.javacore.Oexeption.exeption.domain.LoginInvalidExeption;

import java.util.Scanner;

public class LoginInvalidExeptionTest01 {
    static void main() {
        try {
            login();
        } catch (LoginInvalidExeption e) {
            throw new RuntimeException(e);
        }

    }
    private static void login() throws LoginInvalidExeption {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.print("Username: ");
        String typedUsername = sc.nextLine();
        System.out.print("Password: ");
        String typedPassword = sc.nextLine();

        if (!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)){
            throw new LoginInvalidExeption("Username or Password is Incorrect");
        }

        System.out.println("Login Completed");
    }
}
