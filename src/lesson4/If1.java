/*
Create a program that will input grade and will display the corresponding equivalent. Use if statement in a program.
GRADE	EQUIVALENT
A		EXCELLENT
B		VERY GOOD
C		GOOD
D		FAIR
E		POOR
F		NEEDS IMPROVEMENT 
*/

package lesson4;

import java.util.Scanner;

public class If1 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Grade Remarks\n");
        System.out.print("Enter a grade: ");
        char grade = console.next().charAt(0);

        // Compare grade to A, B, C, D, E, and F
        if (grade == 'A')
        System.out.println(grade + " is your grade and you are EXCELLENT");
        if (grade == 'B')
        System.out.println(grade + " is your grade and you are VERY GOOD");
        if (grade == 'C')
        System.out.println(grade + " is your grade and you are GOOD");
        if (grade == 'D')
        System.out.println(grade + " is your grade and you are FAIR");
        if (grade == 'E')
        System.out.println(grade + " is your grade and you are POOR");
        if (grade == 'F')
        System.out.println(grade + " is your grade and you NEED IMPROVEMENT");

    }
}
