package Chap6.sec13.exam01_class_access.package2;

import Chap6.sec13.exam01_class_access.package1.B;

public class C {
    //A a;  ->error 디폴트 접근 제한 다른 패키지에서 접근 불가
    B b;//다른 패키지에서도 사용가능 (public)
}
