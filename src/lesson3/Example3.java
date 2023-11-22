// Remember to add arguments when running the program

package lesson3;

public class Example3 {
    public static void main(String[] args) {
        // Declare
        String firstname, lastname;
        int age; double weight;

        // Parse command line arguments as variable values
        firstname = args[0];
        lastname = args[1];
        age = Integer.parseInt(args[2]);
        weight = Double.parseDouble(args[3]);

        // Print
        System.out.println("Your name is: " + firstname + " " + lastname);
        System.out.println("Your age is: " + age);
        System.out.println("Your weight is: " + weight);

    }
}
