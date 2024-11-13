package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        
        //초기값 기본 값 확인
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println(        );

        System.out.println("car.speed = " + car.speed);
        System.out.println("car.gear = " + car.gear);
        System.out.println("car.lights = " + car.lights);
        System.out.println();

        System.out.println("car.tire = " + car.tire);
        System.out.println("car.door = " + car.door);
        System.out.println();

        car.color = "blue";
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color = " + car.color);
        System.out.println("car.speed = " + car.speed);
        System.out.println("car.lights = " + car.lights);

    }
}
