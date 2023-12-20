package poly.basic;

import javax.sound.midi.Soundbank;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조) - 모든 자식타입 참조 가능함..
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); //Parent타입이여서 childMethod 호출 불가
        //Child child1 = new Parent(); //Compile Error

    }
}
