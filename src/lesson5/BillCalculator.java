package lesson5;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, itemName;
        int quantity;
        double price, cash, total;
        char tryAgain = 'n';
        
        do {
            // Ask inputs
            System.out.print("Please enter Customer Name: ");
            name = scanner.nextLine();
            System.out.print("Please enter Purchased Item: ");
            itemName = scanner.nextLine();
            System.out.print("Please enter quantity: ");
            quantity = scanner.nextInt();
            System.out.print("Please enter price of item: ");
            price = scanner.nextDouble();
            System.out.print("Please enter cash: ");
            cash = scanner.nextDouble();
    
            total = quantity * price;
            
            // Check if we should offer a discount
            if (total >= 1000) {
                total -= total * 0.30;
            }
            
            // Check if customer has enough cash
            if (total > cash) {
                System.out.println("Not enough cash!");
                System.out.print("\nDo you want to try again? (Y/n) > ");
                tryAgain = scanner.next().charAt(0);
                // Clear buffer
                scanner.nextLine();
                continue;
            }

            // Print receipt
            System.out.println("\nCustomer Name: " + name);
            System.out.println("Purchased Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Total: " + total);
            System.out.println("Cash: " + cash);
            System.out.println("Change: " + (cash - total));

            System.out.print("\nDo you want to try again? (Y/n) > ");
            tryAgain = scanner.next().charAt(0);
            scanner.nextLine();
        } while (tryAgain == 'y' || tryAgain == 'Y');

        scanner.close();
    }
}
