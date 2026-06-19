//Keep Entering your number till user enter  a multiple of 10

package day4Loops;
import java.util.*;

public class Question {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your no.: ");
            int n = sc.nextInt();
            if (n%10== 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
    
}
