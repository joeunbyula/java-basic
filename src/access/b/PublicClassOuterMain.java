package access.b;


import access.a.PublicClass;

import java.util.Date;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 다른패키지는 접근 불가
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass1 = new DefaultClass2();

        System.out.println(new Date());
    }
}
