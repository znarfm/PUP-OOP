/* Maria deposited her money in time deposit at a bank is Php 30000. 
The bank gave her 12% for a term of 30 days. There is a 10% withholding
tax to be deducted from the interest. 
(A) Find her withholding tax. 
(B) Find the net interest she will receive. 
Use the following formula: 
I = Prt, where I - Interest, P - Principal value, R - Rate of interest and T - time. */

package lesson3;

public class Act4dos {
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

        time = (double) days / 365;
        double interest = principal * rate * time;
        double tax = interest * 0.1;
        double net = interest - tax;

        // Print results
        System.out.println("Client name: " + name);
        System.out.printf("Withholding tax: %.2f\n", tax);
        System.out.printf("Net Interest: %.2f\n", net);
    }
}
