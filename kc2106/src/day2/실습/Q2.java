package day2.실습;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a/b;
        int d = a%b;

        System.out.println(" A   = " + c + " * " + " B " + " + " + d);


    }
}
