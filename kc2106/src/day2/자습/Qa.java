package day2.자습;

import java.util.Scanner;

public class Qa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int base = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(((a + b - c)*d)/e);*/

        // ((a+=b)-=c)*=d)/=e

        int base = scanner.nextInt();
        base += scanner.nextInt();
        base -= scanner.nextInt();
        base *= scanner.nextInt();
        base /= scanner.nextInt();
        System.out.println(base);

    }
}
