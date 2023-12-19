package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); // final이라 참조값 변경 불가능

        //참조 대상의 값은 가능하다
        data.value = 20;
        System.out.println("data.value = " + data.value);
        data.value = 10;
        System.out.println("data.value = " + data.value);
    }
}
