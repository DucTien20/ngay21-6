package day2.자습;

import java.util.Scanner;

public class Qf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a*=a;
        System.out.println(a % 10);
        a*=a;
        System.out.println(a%10);
        a*=a;
        System.out.println(a%10);
    }
}
