package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //override (부모의 기능을 자식이 재정의)
        electricCar.openDoor();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.openDoor();
        gasCar.fillUp();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.openDoor();
        hydrogenCar.fillHydrogen();
    }
}
