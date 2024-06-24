package day2.자습;

import java.util.Scanner;

public class Qe {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();


    String message = (a%b==0) && (a%c==0)? "true":"false";
        System.out.println(message);
    }
}
