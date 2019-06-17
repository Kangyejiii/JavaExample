package chap7.sec06.exam02_promotion;

public class Child extends Parent {

    @Override
    public void method2() {
        System.out.println("Child의 method2 호출 //오버라이딩");

    }

    public void method3() {
        System.out.println("Child의 method3 호출");
    }
}
