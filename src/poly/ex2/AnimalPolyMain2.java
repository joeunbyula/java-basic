package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Pig()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 start");
        animal.sound();
        System.out.println("동물소리 테스트 end");
    }
}
