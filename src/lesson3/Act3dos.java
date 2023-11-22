/* Write a program that computes the gross pay of a 
worker name Juan Dela Cruz given that he has 40 hours
a week and his rate is 84.50 per hour. Print the gross pay. */

package lesson3;

public class Act3dos {
    public static void main(String[] args) {
        // Given values
        String workerName = "Juan Dela Cruz";
        int hours = 40;
        double rate = 84.50;    // per hour

        // Calculate gross pay
        double gross = hours * rate;

        System.out.println("Hello, " + workerName + "!");
        System.out.printf("Your gross pay is PHP %.2f\n", gross);
    }
}
