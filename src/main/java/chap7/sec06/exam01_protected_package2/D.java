package chap7.sec06.exam01_protected_package2;

import chap7.sec06.exam01_protected_package1.A;

public class D extends A {
    public D() {
        super();// 생략해도 가능
        this.field = "value"; //다른패키지라도 자식 클래스니깐 protected field 사용 가능
        this.method();
    }

}
