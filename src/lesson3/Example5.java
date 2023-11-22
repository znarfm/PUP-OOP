package lesson3;

import javax.swing.JOptionPane;

public class Example5 {
    public static void main(String[] args) {
        // Declare
        String first, second;
        int sum;

        // Show window to ask for numbers
        first = JOptionPane.showInputDialog("Enter first number");
        second = JOptionPane.showInputDialog("Enter second number");
        sum = Integer.parseInt(first) + Integer.parseInt(second);

        // Show window that prints the result
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);

        // Exit
        System.exit(0);
    }
}
