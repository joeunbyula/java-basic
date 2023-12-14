package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public : 전체
        data.publicField = 1;
        data.publicMethod();

        //default : 같은 패키지
        data.defaultField = 2;
        data.defaultMethod();

        //private : 같은 클래스내에서만 사용 가능함으로 호출불가
//        data.pricateField = 3;
//        data.privateMethod();

        data.innerAccess();
        //안에 private이 있지만 innerAccess는 public이고 안에 private이 있더라도
        // 내부에서 호출되는 것이라 가능하다.
    }
}
