package chap7.sec06.exam01_protected_package1;

public class B {
    public void method() {
        A a = new A();  //같은 패키지라서 생성 가능
        a.field = "value";  //같은 패키지라서 필드 접근 가능
        a.method(); //같은 패키지라서 호출 가능
    }
}
