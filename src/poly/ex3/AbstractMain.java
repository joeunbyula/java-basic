package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        //AbstractAnimal abstractAnimal = new AbstractAnimal(); //생성 불가!
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.move();
        cat.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 start");
        animal.sound();
        System.out.println("동물소리 테스트 end");
    }
}
