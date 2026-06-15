import java.util.*;
public class day1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter your income");
        double income = sc.nextDouble();
        System.out.println("Your income is: " + income);
        if (income < 300000){
            System.out.println("Your tax is: " + (income * 0.1));
        }
        else if (income >= 300000 && income < 600000){
            System.out.println("Your tax is: " + (income * 0.15));
        }
        else if (income >= 600000 && income < 1000000){
            System.out.println("Your tax is: " + (income * 0.2));
        }
        else {
            System.out.println("Your tax is: " + (income * 0.25));
        }
    }
}
