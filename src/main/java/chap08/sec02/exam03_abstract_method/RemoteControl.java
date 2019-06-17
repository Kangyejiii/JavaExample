package chap08.sec02.exam03_abstract_method;
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
}
