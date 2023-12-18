package lesson5;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d. %s", i + 1, name);
        }

        scanner.close();
    }
}
