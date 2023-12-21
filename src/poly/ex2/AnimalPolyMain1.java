package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        //추가
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 start");
        animal.sound();
        System.out.println("동물소리 테스트 end");
    }

}
