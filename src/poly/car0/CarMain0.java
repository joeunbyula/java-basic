package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Dirver dirver = new Dirver();
        K3Car k3Car = new K3Car();

        dirver.setK3Car(k3Car);
        dirver.dirve();

        //추가
        Model3Car model3Car = new Model3Car();
        dirver.setK3Car(null);
        dirver.setModel3Car(model3Car);
        dirver.dirve();
    }
}
