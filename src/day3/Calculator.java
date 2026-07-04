package day3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature:");
        double temperature = sc.nextDouble();
        if (temperature <= 97){
            System.out.println(" you are fine ");
        } else { System.out.println("you have fever, take care");

        }
    }
}

