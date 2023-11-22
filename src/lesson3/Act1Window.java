/* Create a program that will compute your midterm grade. 
The user will input name, course, grade for two quizzes, 
two recitations, two projects and grade for exam rating.  
Compute the average of two quizzes, two recitation and 
two projects. Use these formulas to compute the midterm grade. 
Class standing equals to the sum of the quiz, recitation and 
project divide by 3. To compute prelim grade, class standing 
should be multiplied by 2 and add the result for exam rating. */

package lesson3;

import javax.swing.JOptionPane;

public class Act1Window {
    public static void main(String[] args) {
        // Variable declaration
        String name, course;
        float quiz1, quiz2, recitation1, recitation2, project1, project2, exam;
        float quizAverage, recitationAverage, projectAverage;
        float prelimGrade, classStanding;

        // Ask for values
        name = JOptionPane.showInputDialog("Enter your name");
        course = JOptionPane.showInputDialog("Enter your course");

        quiz1 = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Quiz #1"));
        quiz2 = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Quiz #2"));

        recitation1 = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Recitation #1"));
        recitation2 = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Recitation #2"));

        project1 = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Project #1"));
        project2 = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Project #2"));

        exam = Float.valueOf(JOptionPane.showInputDialog("Enter your grade for Exam"));
        
        // Compute average of quizzes, recitations, and projects
        quizAverage = (quiz1 + quiz2) / 2;
        recitationAverage = (recitation1 + recitation2) / 2;
        projectAverage = (project1 + project2) / 2;
        
        // Compute for class standing
        classStanding = (quizAverage + recitationAverage + projectAverage) / 3;

        // Compute for Prelim grade
        prelimGrade = (classStanding * 2 + exam) / 3;

        // Show class standing and prelim grade
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!\nYour grades will be available in the next window...", course + " Student Grade", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("%.2f", classStanding), "Class Standing", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("%.2f", prelimGrade), "Prelim Grade", JOptionPane.INFORMATION_MESSAGE);
        
    }    
}