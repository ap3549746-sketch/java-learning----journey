package day3;
import java.util.Scanner;
public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Ashish");
                break;
            case 2:
                System.out.println("Ravi");
                break;
            case 3:
                System.out.println("Manish");
                break;
            case 4:
                System.out.println("Neha");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
