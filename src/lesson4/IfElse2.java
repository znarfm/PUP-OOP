/* 
Create another program that will input a number and will determine if it is odd or even number. 
Use if else statement in the program.
 */

package lesson4;

import java.util.Scanner;

public class IfElse2 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Odd or Even\n");
        System.out.print("Enter a number: ");
        int number = console.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
