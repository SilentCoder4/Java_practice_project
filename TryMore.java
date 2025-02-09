//WAP to handle the Exception using try and multiple catch block.
import java.util.Scanner;

public class TryMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();
            int result = num / denom;
            System.out.println("Result: " + result);


            int[] numbers = {10, 20, 30, 40};
            System.out.print("Enter index (0-3): ");
            int index = scanner.nextInt();
            System.out.println("Array value: " + numbers[index]);


            String str = null;
            System.out.println("String length: " + str.length());

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index! Please enter between 0 and 3.");
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}
