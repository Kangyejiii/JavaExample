package chap08.sec04.exam02_default_method_use;
/*
* 상수 필드 : 선언과 동시에 초기값을 지정해야한다.
* */
public interface RemoteControl {
    //상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    // public abstract 가 생략되어있다.
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    //default method -> 실행블록을 가지고있다.
    //default method : 구현객체가 있어야 사용 가능 바로 RemoteControl.setMute()(x)
    // 구현객체가 공통으로 가지고 있는 메소드 -> 기본 메소드로 사용한다.
    // 상황에따라 재정의가 가능하다

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리합니다.");
        } else {
            System.out.println("무음 헤제합니다.");
        }
    }

    //정적 메소드 : 인터페이스로 바로 호출이 가능하다.
    //RemoteControl.changeBattery();
    static void changeBattery() {

        System.out.println("건전지를 교환합니다.");
    }

}
