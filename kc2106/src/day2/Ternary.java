package day2;

public class Ternary {
    public static void main(String[] args) {
        //삼항 연산자
        int temperature = 38;
        String message =(temperature < 38)? " ok " : "ferver";
        System.out.println(message);
    }
}
