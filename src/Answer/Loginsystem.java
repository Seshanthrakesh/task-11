package Answer;
import java.util.Scanner;

public class Loginsystem {
    public static void main(String[] args) {
        // Simulated correct password for demonstration purposes
        String correctPassword = "secret123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();
        scanner.close();
        try {
            if (!enteredPassword.equals(correctPassword)) {
                throw new IncorrectPasswordException("Incorrect password entered.");
            } else {
                System.out.println("Login successful!");
                // Perform the rest of your login logic here
            }
        } catch (IncorrectPasswordException e) {
            System.out.println("Error: " + e.getMessage());
            // You can also log the error or perform other error handling tasks here
            e.printStackTrace();
        }
    }
}

class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}