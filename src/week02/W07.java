package week02;

public class W07 {
    public static void main(String[] args) {

        int intNumber = 93 + (int)98.8;
        System.out.println("intNumber = " + intNumber);

        double doubleNumber = (double)93 + 98.8;
        System.out.println("doubleNumber = " + doubleNumber);

        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false;
        System.out.println("b = " + b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println("s = " + s);

        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        int min = (x > y) ? y : x;
        System.out.println("min = " + min);
    }
}
