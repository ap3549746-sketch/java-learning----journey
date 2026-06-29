package day5;

import java.util.Scanner;

public class PatternPractice {

    // 1. Square Pattern
    public static void squarePattern(int n) {
        System.out.println("1. Square Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 2. Right Triangle Pattern
    public static void rightTriangle(int n) {
        System.out.println("2. Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3. Inverted Triangle
    public static void invertedTriangle(int n) {
        System.out.println("3. Inverted Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 4. Pyramid Pattern
    public static void pyramid(int n) {
        System.out.println("4. Pyramid");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    // 5. Right Face Vertical Pyramid
    public static void rightFaceVerticalPyramid(int n) {
        System.out.println("5. Right Face Vertical Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of pattern: ");
        int n = sc.nextInt();

        squarePattern(n);
        rightTriangle(n);
        invertedTriangle(n);
        pyramid(n);
        rightFaceVerticalPyramid(n);

        sc.close();
    }
}

