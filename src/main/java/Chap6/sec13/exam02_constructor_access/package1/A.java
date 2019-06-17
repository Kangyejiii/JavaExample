package Chap6.sec13.exam02_constructor_access.package1;

public class A {

    A a1 = new A(true);
    A a2 = new A();//같은 패키지면 ok
    A a3 = new A("문자열");//자기 자신 클래스에선 가능

    public A(boolean b){}
    A(){}
    private A(String s){}   //클래스 안에서만

}
