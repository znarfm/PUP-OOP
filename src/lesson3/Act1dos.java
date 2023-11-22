/* Create a program that will compute your midterm grade. 
The user will input name, course, grade for two quizzes, 
two recitations, two projects and grade for exam rating.  
Compute the average of two quizzes, two recitation and 
two projects. Use these formulas to compute the midterm grade. 
Class standing equals to the sum of the quiz, recitation and 
project divide by 3. To compute prelim grade, class standing 
should be multiplied by 2 and add the result for exam rating. */

package lesson3;

import java.util.Scanner;

public class Act1dos {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        // Variable declaration
        String name, course;
        float quiz1, quiz2, recitation1, recitation2, project1, project2, exam;
        float quizAverage, recitationAverage, projectAverage;
        float prelimGrade, classStanding;

        // Ask for values
        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.print("Enter your course: ");
        course = console.nextLine();
        
        System.out.print("Enter grade for Quiz #1: ");
        quiz1 = console.nextFloat();
        System.out.print("Enter grade for Quiz #2: ");
        quiz2 = console.nextFloat();

        System.out.print("Enter grade for Recitation #1: ");
        recitation1 = console.nextFloat();
        System.out.print("Enter grade for Recitation #2: ");
        recitation2 = console.nextFloat();

        System.out.print("Enter grade for Project #1: ");
        project1 = console.nextFloat();
        System.out.print("Enter grade for Project #2: ");
        project2 = console.nextFloat();

        System.out.print("Enter grade for exam: ");
        exam = console.nextFloat();
        
        // Compute average of quizzes, recitations, and projects
        quizAverage = (quiz1 + quiz2) / 2;
        recitationAverage = (recitation1 + recitation2) / 2;
        projectAverage = (project1 + project2) / 2;
        
        // Compute for class standing
        classStanding = (quizAverage + recitationAverage + projectAverage) / 3;

        // Compute for Prelim grade
        prelimGrade = (classStanding * 2 + exam) / 3;

        // Show class standing and prelim grade
        System.out.println("Hello, " + name + " from " + course + "!");
        System.out.printf("Class Standing: %.2f\n", classStanding);
        System.out.printf("Prelim Grade: %.2f\n", prelimGrade);
        
    }    
}