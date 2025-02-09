//WAP that implement the Nested try statements.
import java.util.Scanner;
public class InsideTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();


            int result = num / denom;
            System.out.println("Division Result: " + result);

            try {

                int[] arr = {10, 20, 30, 40};
                System.out.print("Enter array index (0-3): ");
                int index = scanner.nextInt();
                System.out.println("Array Value: " + arr[index]);

                try {

                    String str = null;
                    System.out.println("String Length: " + str.length());
                } catch (NullPointerException e) {
                    System.out.println("Error: Null value encountered!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index! Please enter between 0 and 3.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}