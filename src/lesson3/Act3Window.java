/* Write a program that computes the gross pay of a 
worker name Juan Dela Cruz given that he has 40 hours
a week and his rate is 84.50 per hour. Print the gross pay. */

package lesson3;

import javax.swing.JOptionPane;

public class Act3Window {
    public static void main(String[] args) {
        // Given values
        String workerName = "Juan Dela Cruz";
        int hours = 40;
        double rate = 84.50;    // per hour

        // Calculate gross pay
        double gross = hours * rate;

        JOptionPane.showMessageDialog(null, "Hello, " + workerName + "!\nYour gross pay is PHP " + String.format("%.2f", gross) , "Gross Pay", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
