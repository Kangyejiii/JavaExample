package Chap6.sec13.exam02_constructor_access.package1;

public class B {

    A a1 = new A(true);
    A a2 = new A();//같은 패키지면 ok
    // A a3 = new A("문자열"); private :외부에서 호출 x

}
