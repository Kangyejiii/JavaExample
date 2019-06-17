package chap08.sec07.exam01_why_default_meethod;

public class MyClassB implements MyInterface {
    @Override
    public void method1() {
        System.out.println("MyClassB-method1()실행 ");
    }

    //default method 재정의
    @Override
    public void method2() {
        System.out.println("MyClassB-method2()실행 ");
    }
}
