package day4Loops;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}