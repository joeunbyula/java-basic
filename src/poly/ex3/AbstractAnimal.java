package poly.ex3;

public abstract class AbstractAnimal {

    //추상메서드를 가지고 있으면 클래스도 추상클래스어야한다.
    //추상메서드를 자식이라면 꼭 구현해야함.
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
