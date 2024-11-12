package week02.operator;

public class W05 {
    public static void main(String[] args) {
        // 대입연산자. 기본/복합
        // =(기본), +=, -=, *=
        // ++, --

        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);

        number = 10;
        number += 2;
        System.out.println(number);

        number -= 2;
        System.out.println(number);

        number *= 2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number %= 2;
        System.out.println(number);

        number++;
        System.out.println(number);

        number--;
        System.out.println(number);
    }
}
