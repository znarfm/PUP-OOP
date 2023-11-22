/* Create a program that converts the input dollar ($) into 
its equivalent peso Presume that one dollar is equivalent to 50.50 pesos. 
Then display the result on the screen. */

package lesson3;

import javax.swing.JOptionPane;

public class Act2Window {
    public static void main(String[] args) {
        // Declaration
        double dollar, peso;

        // Ask for amount of dollars
        dollar = Double.parseDouble(JOptionPane.showInputDialog("Enter amount in dollars"));

        // Convert dollar to peso
        peso = dollar * 50.50;

        // Show message
        JOptionPane.showMessageDialog(null, "$" + dollar + " is equivalent to PHP" + peso, "Dollar to Peso", JOptionPane.INFORMATION_MESSAGE);
    }
}
