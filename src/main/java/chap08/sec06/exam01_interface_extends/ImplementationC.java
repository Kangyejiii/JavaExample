package chap08.sec06.exam01_interface_extends;

//하위 인터페이스를 구현하는 클래스
//하위 인터페이스의 메소드+상위 인터페이스의 모든 추상 메소드 -> 실체 메소드 있어야함.
public class ImplementationC implements InterfaceC {

    @Override
    public void methodC() {
        System.out.println("ImplementationC-methodC 실행");
    }

    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementationC-methodB 실행");
    }
}
