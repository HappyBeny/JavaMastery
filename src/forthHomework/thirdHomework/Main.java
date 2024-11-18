package thirdHomework;

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator(new AddOperation());
        double  result = cal1.calculate(1,2);
        System.out.println("result = " + result);

        Calculator cal2 = new Calculator(new SubstractOperation());
        result = cal2.calculate(1,2);
        System.out.println("result = " + result);

        Calculator cal3 = new Calculator(new MultiplyOperation());
        result = cal3.calculate(4,2);
        System.out.println("result = " + result);

        Calculator cal4 = new Calculator(new DivideOperation());
        result = cal4.calculate(2,4);
        System.out.println("result = " + result);
    }
}
