package lesson3;

// to use Scanner
import java.util.Scanner;

public class Example2 {
    static Scanner console = new Scanner(System.in); 
    public static void main(String[] args) {
        // Declare
        String firstName, lastName;
        int age; double weight;

        // Ask (string)
        System.out.print("Enter first name and last name separated by space: ");
        firstName = console.next();
        lastName = console.nextLine();

        // Ask (int and double)
        System.out.print("Enter age and weight separated by space: ");
        age = console.nextInt();
        weight = console.nextDouble();

        // Print
        System.out.println("You name is " + firstName + " " + lastName);
        System.out.println("Your age is: " + age);
        System.out.println("Your weight is: " + weight);
    }
}
