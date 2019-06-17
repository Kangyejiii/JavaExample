package chap08.sec04.exam01_abstract_method_use.exam01_name_implement_class;

/* 실행 클래스  구현 클래스를 만들었으니 객체 만들어보자.
* */
/*
 * 디폴트 메소드 사용
 * >인터페이스만으로는 사용할 수 없다. : 구현 객체가 인터페이스에 대입되어야 호출 할 수 있는 인스턴스 메소드이다.
 * RemoteControl.setMute(true); (X) 사용할 수 없다.
 * >모든 구현 객체가 가지고 있는 기본 메소드로 사용한다.
 * : 필요에 따라 구현 클래스가 디폴트 메소드를 재정의해서 사용할 수 있다.
 *
 * */

public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();   //tv의 turnOn()
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();  //추상메소드를 호출하여 Audio의 turnOn 메소드 호출
        rc.turnOff();
        
    }

}
