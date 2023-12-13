package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("메서드 호출 전 = " + data.value);
        changeReference(data);
        System.out.println("메서드 호출 후 = " + data.value);
    }

    private static void changeReference(Data x) {
        x.value = 30;
    }
}
