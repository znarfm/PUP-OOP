/*
Create a program that will compute the area of a circle, area of rectangle and area of square. 
Assign any values for radius, length, width and side for the square.
*/

package lesson4;

import java.util.Scanner;

public class Switch1 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Area calculator\n");
        System.out.println("[C] Circle [R] Rectangle [S] Square [E] Exit");
        System.out.print("Please enter your choice: ");
        char choice = console.next().charAt(0);
        switch (choice) {
            case 'C':
                System.out.print("Radius: ");
                double radius = console.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.printf("Area of the circle: %.4f\n", area);
                break;
            case 'R':
                System.out.print("Length: ");
                double length = console.nextDouble();
                System.out.print("Width: ");
                double width = console.nextDouble();
                area = length * width;
                System.out.println("Area of the rectangle: " + area);
                // System.out.printf("Area of the rectangle: %.4f\n", area);
                break;
            case 'S':
                System.out.print("Side: ");
                double side = console.nextDouble();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;
            case 'E':
                System.out.println("Quitting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.\nQuitting...");
                break;
        }
    }
}
