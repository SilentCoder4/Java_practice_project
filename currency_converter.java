import java.io.*;
import java.util.*;
public class currency_converter {
    public static void main(String args[])  {

        HashMap<Integer, String> curencycodes = new HashMap<Integer,String>();

        curencycodes.put(1, "USD");
        curencycodes.put(2, "INR");

        String fromCode, toCode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the currency converter: ");

        System.out.println("Currency converting From? ");
        System.out.println("1 : USD (US Dollar)\t 2 : INR (Indian Rupee)");
        fromCode = curencycodes.get(sc.nextInt());

        System.out.println("Currency converting To? ");
        System.out.println("1 : USD (US Dollar)\t 2 : INR (Indian Rupee)");
        fromCode = curencycodes.get(sc.nextInt());

        System.out.println("Amount you wish to convert?");
        amount = sc.nextFloat();

//        sendHttpGETRequest(fromCode, toCode, amount);

        System.out.println("Thank you for using the currency converter");
    }
}