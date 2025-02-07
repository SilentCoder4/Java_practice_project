import java.util.Scanner;

//WAP to test the prime number
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = false;

        System.out.print("Enter a number to check is it prime or not : ");
        num = sc.nextInt();
        float div = (float) (num/2);

        if( num == 0||num == 1){
            System.out.println("It is prime number");
        }
        else {
            for (int i = 1;i < div;i++){
                if(num%i == 0){
                    System.out.println("It is not a prime number");
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println("it is prime number");
            }
        }
    }
}
