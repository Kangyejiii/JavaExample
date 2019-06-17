package Chap6.sec13.exam03_field_method_access.exam02_constructor_access.package1;

public class A {

    public int field1;
    int field2;
    private int field3;

    public A(){
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method();
        method2();
        method3();

    }

    public void method() {} //접근 제한이 없다
    void method2() {}       //default
    private  void method3() {}  //같은 클래스 내에서만

}
