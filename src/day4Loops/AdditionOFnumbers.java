package day4Loops;
import java.util.*;
public class AdditionOFnumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:- ");
        int N = sc.nextInt();
        int sum = 0;
        int i=1;
        while (i<=N){
        sum = sum+i;
        i++;
        }
        System.out.print("sum is :" +sum);
    }
    
}
