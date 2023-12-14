package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    public MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade=50;
        /**
         * 생성자 내부에서 자기자신의 생성자 호출가능
         * *중요* 생성자의 첫줄에만 작성할 수 있다!!!!
         */
        this(name,age,50);
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
