package Chap6.sec13.exam03_field_method_access.exam02_constructor_access.package1;

public class B {

    public B(){
        A a = new A();

        a.field1 = 1;
        a.field2 = 1;
       // a.field3 = 1; -> private

        a.method();
        a.method2();   //default 같은 패키지 내 가능
        //a.method3(); -> private
    }

}
