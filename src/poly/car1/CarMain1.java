package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Dirver dirver = new Dirver();
        K3Car k3Car = new K3Car();
        dirver.setCar(k3Car);
        dirver.drive();

        Model3Car model3Car = new Model3Car();
        dirver.setCar(model3Car);
        dirver.drive();

        NewCar newCar = new NewCar();
        dirver.setCar(newCar);
        dirver.drive();
    }
}
