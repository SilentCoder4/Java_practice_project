//WAP to find the avereage and soum of the N number Using Commad line arugument
import java.util.Scanner;

public class SumAvgCLI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :  ");
        int n = sc.nextInt();

        double sum = 0;
        System.out.println("Enter the Elements:  ");
        for(int i = 0; i < n; i++)  {
            sum += sc.nextDouble();
        }
        double avg = sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
