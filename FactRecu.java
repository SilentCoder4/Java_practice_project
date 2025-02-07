import java.util.Scanner;

//WAP to find the factorial of a given number using Recursion.
public class FactRecu {
    static int fact(int num){
        if(num == 0 ){
            return 1;
        }
        else{
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int InputValu;
        System.out.println("Enter the number for factorial is : ");
        InputValu = sc.nextInt();

        System.out.println("Factorial of " + InputValu + " is : " + fact(InputValu));
    }
}
