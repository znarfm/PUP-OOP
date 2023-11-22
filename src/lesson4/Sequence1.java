/*
Create a program that will compute the average of your final grade. 
The user will input value for prelim, midterm and finals. 
Compute the total and its average.
*/

package lesson4;

import java.util.Scanner;

public class Sequence1 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Grade Calculator\n");
        System.out.print("Enter grade for prelim: ");
        int prelim = console.nextInt();
        System.out.print("Enter grade for midterm: ");
        int midterm = console.nextInt();
        System.out.print("Enter grade for finals: ");
        int finals = console.nextInt();

        System.out.println("\nThe grade for prelim is: " + prelim);
        System.out.println("The grade for midterm is: " + midterm);
        System.out.println("The grade for finals is: " + finals);

        int total = prelim + midterm + finals;
        double average = total / 3.0;
        System.out.println("\nThe total grade is: " + total);
        System.out.println("The final grade average is: " + average);
    }
}
