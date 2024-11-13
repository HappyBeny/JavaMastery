package week03;

public class Car {
    // 고유 데이터 영역
    String company;
    String model;
    String color;
    double price;

    // 상태 데이터 영역
    double speed;
    char gear; //P, R, N, D
    boolean lights;

    // 객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    //생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car () {
        // 아무것도 없는 기본 생성자
        System.out.println("생성자가 호출되었습니다. 객체가 생성됩니다.");
    }

    double gasPedal (double kmh, char type) {
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    double breakPedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLight () {
        lights = !lights;
        return lights;
    }

    void horn () {
        System.out.println("빵빵!");
    }

    void carSpeed(double... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
