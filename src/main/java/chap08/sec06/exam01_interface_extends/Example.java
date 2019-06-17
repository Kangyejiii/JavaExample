package chap08.sec06.exam01_interface_extends;

// TODO: 2019-06-16  인터페이스 상속

public class Example {

    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        //하위 인터페이스로 타입 변환 되면
        // 상 하위 인터페이스에 선언된 모든 메소드를 사용

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
