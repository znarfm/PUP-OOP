// Window-based

package lesson3;

import javax.swing.JOptionPane;

public class Example4 {
    public static void main(String[] args) {
        // Declare
        String name;

        // Show a window that asks for name
        name = JOptionPane.showInputDialog("Enter your name "); 

        // Show a window that greets the user
        JOptionPane.showMessageDialog(null, "Hello " + name, "Welcome!", JOptionPane.PLAIN_MESSAGE);

        // Exit
        System.exit(0);

    }
}
