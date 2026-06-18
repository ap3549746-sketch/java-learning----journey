package day3;

import java.util.Scanner;
public class CheckstudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student:");
        int marks = sc.nextInt();
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("The student has " + result);
    }
    
}
