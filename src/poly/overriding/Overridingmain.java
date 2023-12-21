package poly.overriding;

public class Overridingmain {
    public static void main(String[] args) {
        //자식변수가 자식인스턴스 참조
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("value="+child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("parent->parent");
        System.out.println("value="+parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("value="+poly.value); //변수는 오버라이딩 X
        parent.method(); //메소드는 오버라이딩 O
    }
}
