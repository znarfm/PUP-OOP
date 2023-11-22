/*
Create a program that will input a grade and will display its
corresponding equivalent based on the given below. 
Use logical operator and else if statement in the program. 

Grades		Equivalent
99-100		1.00
96-98		1.25
93-95		1.50
90-92		1.75
87-89		2.00
84 – 86		2.25
81 – 83		2.50
77 – 80		2.75
75 -76		3.00
Below 75	5.00
*/

package lesson4;

import java.util.Scanner;

public class ElseIf1 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Grade Equivalent\n");
        System.out.print("Enter a grade: ");
        int grade = console.nextInt();

        System.out.print("Your grade is ");
        if (grade >= 99) {
            System.out.println("1.00");
        } else if (grade >= 96) {
            System.out.println("1.25");
        } else if (grade >= 93) {
            System.out.println("1.50");
        } else if (grade >= 90) {
            System.out.println("1.75");
        } else if (grade >= 87) {
            System.out.println("2.00");
        } else if (grade >= 84) {
            System.out.println("2.25");
        } else if (grade >= 81) {
            System.out.println("2.50");
        } else if (grade >= 77) {
            System.out.println("2.75");
        } else if (grade >= 75) {
            System.out.println("3.00");
        } else {
            System.out.println("5.00");
        }
    }
}
