import java.util.Scanner;

public class BCA_Bank {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int menu = 3;

        do {
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Check Balance");
            System.out.println("4: Exit");

            switch (menu) {
                case 1:
                    System.out.println("Deposit");
                    break;
                case 2:
                    System.out.println("Withdraw");
                    break;
                case 3:
                    System.out.println("Check Balance");
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
            }
            System.out.println("Select Following Options: ");
            menu = ask.nextInt();
        } while (menu != 4);
    }
}