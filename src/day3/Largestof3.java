package day3;

public class Largestof3 {
    public static void main (String[]args){
        int A=1;
        int B=3;
        int C=6;
        if ((A>=B)&&((A>=C))){
            System.out.println("A is the largest number");
        } else if (B>=C){
            System.out.println("B is the largest number");
        } else {
            System.out.println("C is the largest number");
        }
    }
}
