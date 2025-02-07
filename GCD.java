//WAP to find GCD of the number.
import java.util.Scanner;

public class GCD {
    static int gcd( int num1, int num2) {
        int i;
        if(num1 < num2) {
            i = num1;
        }
        else{
            i = num2;
            }

        for (i = i; i > 1;i--){
            if(num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int vl1, vl2, GCD_val;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number for GCD: ");
        vl1 = sc.nextInt();
        vl2 = sc.nextInt();

        GCD_val = gcd(vl1, vl2);

        System.out.println("Enter the GCD is : " + GCD_val);
    }
}