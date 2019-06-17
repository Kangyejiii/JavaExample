package Chap6.sec13.exam02_constructor_access.package2;

import Chap6.sec13.exam02_constructor_access.package1.A;

public class C {
    A a1 = new A(true);
    //A a2 = new A(); -> c는 다른 패키지라 접근 불가
    //A a3 = new A("문자열");-> private : 다른 클래스에선 x
}
