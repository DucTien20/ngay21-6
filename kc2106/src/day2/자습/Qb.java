package day2.자습;

import java.util.Scanner;

public class Qb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 현재 시간 이 7시 이다");
        int now = 7;
        int n = scanner.nextInt();
        System.out.println(n + " hehe");



        System.out.println(" 될사간이: "+((now + n) % 12));


    }
}
