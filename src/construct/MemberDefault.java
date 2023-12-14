package construct;

public class MemberDefault {
    String name;

    /**
     * 기본 생성자
     * - 생성자는 반드시 호출 되어야함
     * - 생성자가 없으면 기본 생성자 제공
     * - 생성자가 하나라도 있으면 기본 생성자 생성 X 직접 작성해야함
     */
    public MemberDefault() {
        System.out.println("기본 생성자 호출");
    }

}


