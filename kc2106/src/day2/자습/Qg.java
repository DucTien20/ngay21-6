package day2.자습;

import java.util.Scanner;

public class Qg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double a = scanner.nextDouble();
String message = (a <= 36) || (a >=38)? "true" : "false";
        System.out.println(message);
    }
}
