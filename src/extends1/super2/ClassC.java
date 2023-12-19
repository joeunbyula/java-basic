package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); //기본생성자가 아닌 경우는 직접 호출을 해야함
        System.out.println("ClassC.ClassC");
    }
}
