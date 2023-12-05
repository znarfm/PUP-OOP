package lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        System.out.print("Enter size of multiplication table: ");
        choice = scanner.nextInt();

        for (int i = 1; i <= choice; i++) {
            for (int j = 1; j <= choice; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
