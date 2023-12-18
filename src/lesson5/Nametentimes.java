package lesson5;

import java.util.Scanner;

public class Nametentimes {
	public static void main (String [] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		String name;
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		int i = 0;
		do {	
			System.out.printf("%d. %s\n", i + 1, name);
			i++;
		} while (i < 10);

		scanner.close();
	}
}
