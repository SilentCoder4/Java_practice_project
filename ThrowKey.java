// WAP to handle the user defined exception using throw keyword.
import java.util.Scanner;
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowKey {
    public static int age;
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the age: ");
            age = sc.nextInt();

            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative!");
            }

            System.out.println("Age is: " + age);
        } catch (InvalidAgeException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}