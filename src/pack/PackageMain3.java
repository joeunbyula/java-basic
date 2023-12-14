package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();

        /**
         * 다른 패키지 같은 이름일땐 하나 import를 할 수 있다
         * 나머지는 전체 경로를 적어줘야한다.
         */


    }
}
