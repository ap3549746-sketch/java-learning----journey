package day4Loops;
import java.util.*;
public class writingTable {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = sc.nextInt();
        for (int i =1; i<=10; i++){
        System.out.println(number + "*" + i + " = " + number *i);
            }
        System.out.println();
        }

    }
    

