package final1;

/**
 * final
 * - 지역변수 선언 시 한번 값이 할당되면 값을 변경할 수 없다.
 * - 매개변수도 마찬가지로 매서드가 호출된 시점에 사용된 값이 끝까지 사용된다.
 */
public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //Compile error

        //final 지역변수 2
        final int data2 = 10;
        //data2 = 20; //Compile Error

    }

    static void method(final int parameter) {
        // parameter = 20; //Complie error
    }
}
