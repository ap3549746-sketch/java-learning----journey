package day4Loops;
import java.util.*;
public class ReverseOfNumber {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your Number for reverse;");
    int n = sc.nextInt();
    int reverse = 0;
    while (n>0){
        int digit = n%10;
        reverse = reverse *10 + digit;
        n=n/10;
    }
    System.out.println("reverse number:" + reverse);
    }

    
}
