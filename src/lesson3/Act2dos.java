/* Create a program that converts the input dollar ($) into 
its equivalent peso Presume that one dollar is equivalent to 50.50 pesos. 
Then display the result on the screen. */

package lesson3;

import java.util.Scanner;

public class Act2dos {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        // Declaration
        double dollar, peso;

        // Ask for amount of dollars
        System.out.print("Enter amount in dollars: ");
        dollar = console.nextDouble();

        // Convert dollar to peso
        peso = dollar * 50.50;

        // Show message        
        System.out.printf("$%.2f is equivalent to PHP %.2f\n", dollar, peso);
    }
}
