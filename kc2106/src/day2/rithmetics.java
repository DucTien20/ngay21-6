package day2;

public class rithmetics {
    public static void main(String[] args) {
// 일반적인 사칙연산
        int plus = 10 + 20;
        int minus = 20 -10;
        int multiply = 10 * 20;
         int divide = 10 / 20;
         int module = 15 % 10;

        System.out.println(21/10);

        double notDivideInt = 21/ 10;
        System.out.println(notDivideInt); //2.0

        // int result = 10.2 + 2 sai. khai so nguyen phai nhap so ngyen
        // 형변환  type Casting
        int integer =(int ) 2.1; // ep kieu
        System.out.println(integer);

// 묵시적  형변환 ( imlitic)
        
        byte aByte = 1;
        short aShort = aByte;
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;
        
        // 명시적  ( explitic)
        
        double doubleVar = 10.24;
        int castDouble = (int) doubleVar;
        
        //데이터 손실히 가능한다
        int dataLost = (int) 4234234234234L;
        System.out.println(dataLost);

        //muon chuyen ket qua phep chia thanh so thu thi chuyen 1 trong 2 thanh so thuc
        double doubleDivide = (double)21 / 10;
        System.out.println(doubleDivide); // 2.1

char aChar = 'A';
        System.out.println(aChar + 10);
        System.out.println( (char)( aChar + 10));

        //문자 덧셈

        String hello = " hello";
        String world = "world!!!";
        String helloworld = hello + " " + world;
        System.out.println(helloworld);

        // voi nhung kieu du lieuj khac nhau

        int date = 22;
        System.out.println(" to day is " + date + ".");

    // 증감 연산자
        int count = 0;
        count--; //count = count - 1
        System.out.println(count);

        count = 10;
        // cong truoc roi dung gia tri
        ++count;

        count++; // dung roi moi con vao
        System.out.println(++count);
        System.out.println(count++);
        System.out.println(count);

        int addTo = 1;
        addTo += 10; // addTo = addTo (- / * + % 10)
        System.out.println(addTo); //11

        int base = 2;
        base*=base;
        System.out.println(base);
    }

}
