/* Maria deposited her money in time deposit at a bank is Php 30000. 
The bank gave her 12% for a term of 30 days. There is a 10% withholding
tax to be deducted from the interest. 
(A) Find her withholding tax. 
(B) Find the net interest she will receive. 
Use the following formula: 
I = Prt, where I - Interest, P - Principal value, R - Rate of interest and T - time. */

package lesson3;

import javax.swing.JOptionPane;

public class Act4Window {
    public static void main(String[] args) {
        /*  Given values
        P = 30000
        R = 0.12
        T = 30 / 365 */
        String name = "Maria";
        int days = 30;
        double principal = 30000;
        double rate = 0.12;
        double time;

        // Formula
        time = (double) days / 365;
        double interest = principal * rate * time;
        double tax = interest * 0.1;
        double net = interest - tax;

        // Print results
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Net Interest Calculator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("%.2f", tax), "Withholding Tax", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("%.2f", net), "Net Interest", JOptionPane.INFORMATION_MESSAGE);
    }
}
