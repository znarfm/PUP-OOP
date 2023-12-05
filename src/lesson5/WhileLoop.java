package lesson5;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // while loop
        int i = 0;
        while (i < 10) {
            System.out.println(name);
            i++;
        }

        scanner.close();
    }
}
