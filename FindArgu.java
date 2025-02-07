//Wap to find the number of arguments provide at runtime.
import java.util.Scanner;

public class FindArgu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] ={48,56,45,49,3,48,218,84,58,351,84,21,8,56,84,5,156,16,97,12};
        int find,i;
        boolean isfind = false;

        System.out.print("Enter the value to find :  ");
        find = sc.nextInt();

        for (i = 0;i < list.length;i++) {
            if(find == list[i]) {
                System.out.println("The argument is found: list[" + i + "] value is : " + list[i]);
                isfind = true;
                break;
            }
        }
        if(isfind != true)
            System.out.println("The argument is not found.");
    }
}