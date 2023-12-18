package lesson6;

import java.util.Scanner;

/**
 *
 * @author nard
 */
public class NameArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter number of names to store: ");
        int size = console.nextInt();
        console.nextLine();         // Catches the stray new line

        // Create array
        String[] names = new String[size];

        // Get names and store in array
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = console.nextLine();
        }

        // Display names
        System.out.println("\n==================================\n");
        System.out.println("Here are the names you entered: ");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%d. %s\n", i + 1, names[i]);
        }

        console.close();
        System.exit(0);
    }
}
