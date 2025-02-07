//WAT to calculate the Simple Interest and Input by the user.
import java.util.Scanner;

public class IntrestCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double TotalAmount,InterstAmount;
        float PrinciaplAmount,intsrest;
        int Year;

        System.out.print("Enter the Principal Amount:  ");
        PrinciaplAmount = sc.nextFloat();
        System.out.print("Enter the interest percentage per/anm :  ");
        intsrest = sc.nextFloat();
        System.out.print("Enter the the number of Years:  ");
        Year = sc.nextInt();

        InterstAmount = (intsrest/100)*PrinciaplAmount;
        TotalAmount = InterstAmount + PrinciaplAmount;
        System.out.println("========================================================");
        System.out.println("The Amount of Interest on " + PrinciaplAmount + " is :  " + InterstAmount);
        System.out.println("The Total Amount with Interest in one year is:  " + (PrinciaplAmount + InterstAmount));
        System.out.println("The Total Amount the year is:  " + (PrinciaplAmount + InterstAmount)*Year );
        System.out.println("========================================================");
    }
}