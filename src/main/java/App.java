/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPRYIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PassVal passVal = new PassVal("abc$123");
        String attempt;
        boolean isCorrect;

        System.out.print("what is the password? ");
        attempt = input.nextLine();

        isCorrect = passVal.validateAttempt(attempt);

        if(isCorrect)
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you");
    }
}

class PassVal {
    private final String pass;

    public PassVal(String password) {
         pass = password;
    }

    public boolean validateAttempt(String attempt) {
        return (this.pass.equals(attempt));
    }
}
