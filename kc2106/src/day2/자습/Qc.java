package day2.자습;

import java.util.Scanner;

public class Qc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int win = scanner.nextInt();
        int draw = scanner.nextInt();
        int lose = scanner.nextInt();

        double a = (win / (double)(win+lose));

        System.out.println(String.format(" %d승 %d무 %d패  승률: %.3f", win, draw, lose, a));
    }
}
