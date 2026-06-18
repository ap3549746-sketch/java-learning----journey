package day3;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number A:");
        int A = sc.nextInt();

        System.out.print("Enter number B:");
        int B = sc.nextInt();

        System.out.print("Choose operation:");
        System.out.println("1:+ 2:- 3:% 4:/ 5:*");

        int command = sc.nextInt();

        switch (command) {
            case 1:
                System.out.println("Result = " + (A + B));
                break;
            case 2:
                System.out.println("Result = " + (A - B));
                break;
            case 3:
                System.out.println("Result = " + (A % B));
                break;
            case 4:
                System.out.println("Result = " + (A / B));
                break;
            case 5:
                System.out.println("Result = " + (A * B));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}