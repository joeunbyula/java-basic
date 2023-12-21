package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물소리 테스트 start");
        dog.sound();
        System.out.println("동물소리 테스트 end");
        soundCat(cat);
        soundCaw(caw);

    }

    private static void soundCat(Cat cat) {
        System.out.println("동물소리 테스트 start");
        cat.sound();
        System.out.println("동물소리 테스트 end");
    }

    private static void soundCaw(Caw caw) {
        System.out.println("동물소리 테스트 start");
        caw.sound();
        System.out.println("동물소리 테스트 end");
    }
}
