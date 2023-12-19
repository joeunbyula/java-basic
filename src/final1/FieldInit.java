package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;
    final int value   = 10;

    public FieldInit() {
        //이미 할당 된 값은 생성자 초기화 할 때에도 값을 재할당 할 수 없다.
    }
}
