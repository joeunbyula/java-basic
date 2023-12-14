package construct;

public class MemberThis {
    String nameField;
    void initMember(String nameParameter) {
        nameField = nameParameter;
        //IDE에서 색으로 구분해주기때문에 안써도된다..
        //this.nameField = nameParamter; //생략가능하지만 사용해도된다. (코드 명확성)
    }
}
