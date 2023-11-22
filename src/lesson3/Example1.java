package lesson3;

// to use BufferedReader
import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        // Declare variables
        String firstName, lastName;
        int age;
        double weight;

        // Create BufferedReader object
        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

        // Ask for first name
        System.out.print("Enter first name: ");
        firstName = buffread.readLine();

        // Ask for last name
        System.out.print("Enter Last Name: ");
        lastName = buffread.readLine();

        // Ask for age
        System.out.print("Enter Age: ");
        age = Integer.parseInt(buffread.readLine());

        // Ask for weight
        System.out.print("Enter weight: ");
        weight = Double.parseDouble(buffread.readLine());

        // Print
        System.out.println("Your Name is: "+ firstName + " " + lastName);
        System.out.println("Your Age is: " + age + " years old");
        System.out.println("Your Weight is: " + weight + "kg");
    }
    
}
