package extends1.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("전기를 충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("빠르게 차가 이동합니다.");
    }
}
