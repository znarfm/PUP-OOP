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
			System.out.println(name);
			i++;
		} while (i < 11);

		scanner.close();
	}
}
