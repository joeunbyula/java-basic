package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public DecoData() {
    }

    public static void staticCall() {

        //static에서 인스턴스 변수/메서드 접근 -> complie error
        //인스턴스 변수나 메서드는 인스턴스가 생성되면 힙메모리에 생성되는데
        //정적메서드가 존재하는 클래스영역에서는 인스턴스의 참조값을 알 수가 없음!
//        instanceValue++;
//        instanceMethod();

        staticValue++; //정적변수에 접근
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        //static메서드지만 인스턴스의 참조값을 알 수 있어서 접근 가능!
        data.instanceValue++;
        data.instanceCall();
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수에 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}

