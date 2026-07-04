//Problem
//Write a Java program to calculate the sum of all elements in an array.
//Example
//Input
//5
//2 4 6 8 10
//Output
//Sum = 30

package Arrays;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
    

