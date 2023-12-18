package lesson6;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Array declaration and initialization
        String[] names = new String[3];
        double[][] scores = new double[3][3];

        // Get names and scores
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter Student #%d name: ", i + 1);
            names[i] = console.nextLine();

            System.out.print("Prelim: ");
            scores[i][0] = console.nextDouble();
            console.nextLine(); // Consume newline character
            
            System.out.print("Midterm: ");
            scores[i][1] = console.nextDouble();            
            console.nextLine(); // Consume newline character

            System.out.print("Finals: ");
            scores[i][2] = console.nextDouble();
            console.nextLine(); // Consume newline character
        }

        // Printing outputs
        System.out.println("\n==================================\n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Name\t:  %s\n", names[i]);
            System.out.printf("Prelim\t:  %.2f\n", scores[i][0]);
            System.out.printf("Midterm\t:  %.2f\n", scores[i][1]);
            System.out.printf("Finals\t:  %.2f\n", scores[i][2]);
            System.out.printf("\nAverage\t:  %.2f\n\n", (scores[i][0] + scores[i][1] + scores[i][2]) / 3);
        }

        // End of program
        console.close();
        System.exit(0);
    }
}
