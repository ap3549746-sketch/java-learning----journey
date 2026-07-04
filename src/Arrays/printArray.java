package Arrays;

//Problem
//Write a Java program to take n elements as input and print all the elements of the array.
//Example
//input
//5
//10 20 30 40 50
//Output
//10 20 30 40 50

import java.util.Scanner;
public class printArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}