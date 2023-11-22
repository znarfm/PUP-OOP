/*
Create a program that will input customer’s name, purchased item, quantity, 
price and cash. Compute the Total Bill and the change of the customer. 
If the customer reaches the total bill which is greater than or equal to 1000 pesos, 
he or she gets 30% discount of his/her total bill. 
*/

package lesson4;

import java.util.Scanner;

public class IfElse3 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bill Calculator\n");
        System.out.print("Customer Name: ");
        String name = console.nextLine();
        System.out.print("Purchased Item: ");
        String item = console.nextLine();
        System.out.print("Quantity: ");
        int quantity = console.nextInt();
        System.out.print("Price: ");
        double price = console.nextDouble();
        double total = quantity * price;
        System.out.printf("Total Price is: %.2f\n", total);
        System.out.print("Cash: ");
        double cash = console.nextDouble();

        // Check if we will apply 30% discount
        if (total >= 1000) {
            total = total - (total * 0.3);
            System.out.printf("The Total Bill is: %.2f\n", total);
        } else {
            System.out.printf("The Total Bill is: %.2f\n", total);
        }
        System.out.printf("The Change is: %.2f\n", cash - total);
        
    }
}
