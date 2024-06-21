package day2;

public class comparison {
    public static void main(String[] args) {
        // 비교 연산자
        int small1= 10;
        int small2 = 10;
        int big =12;
        //
        System.out.println(small1==small2);
        System.out.println(small1 == big);
        System.out.println(small1 != small2);
        System.out.println(big!= small1);

        System.out.println(big> small1);


        //논리 연산
        int temperature = 37;
        //제온 36도 미만 또는 38도 이상
        System.out.println(temperature < 36);
        System.out.println(temperature >= 38);

        System.out.println(temperature < 36 || temperature >= 38);
        System.out.println(temperature > 36 && temperature < 38);


        int base = 12;
        int num = 3;

        // base co phai la boi so cua num

        System.out.println(base % num == 0);

        int[] scores = { 10 , 9, 0};

        int sum = scores[0] + scores[1] + scores[2];
        System.out.println(((double) sum /3) > 8.5);
        // double agv = sum / 3

        //논리 연산

        int temperature1 = 37;
        int age = 20;

        //nhiet do duoi 37 va 20 tuoi tro len

        //so sanh nhieu dieu kien

        System.out.println(temperature1 <= 37 && age >=20);
        boolean notSick = temperature1 <= 37;
        boolean isOfAge = age >=20;
        System.out.println(notSick && isOfAge);


        boolean isSunday = false;
        boolean isHoliday = false;
        boolean canRest = isSunday || isHoliday;
        System.out.println(canRest);

        System.out.println(!canRest);

        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(a && b);
        System.out.println(!(b || c));

        // thu tu so sanh ! - && - ||
        System.out.println();
















    }
}
