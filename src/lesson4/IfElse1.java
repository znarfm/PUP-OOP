/*
Create a program that will input a password and will determine if the password is correct, 
display the message, “Password is granted” otherwise “Password is denied”. 
Use your name as your password. The password should be written in uppercase letters.
 */

package lesson4;

import java.util.Scanner;

public class IfElse1 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Password Checker\n");
        String password = "NARD", answer;
        System.out.print("Enter your password: ");
        answer = console.nextLine();

        // Check if password is correct
        if (answer.equals(password)) {
            System.out.println("Your password is granted: " + answer);
        } else {
            System.out.println("Your password is denied: " + answer);
        }
    }
}
