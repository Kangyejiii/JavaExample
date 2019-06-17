package chap08.sec03.exam02_noname_implement_class;
/*
* 익명 구현 객체 : 일회성을 위해 소스파일을 만들고 클래스 선언하는 것은 비효율적
* 소스파일을 만들지 않고(ex> Television, Audio (명시적인 구현 클래스) ) 구현 객체를 만들수 있다.
* 인터페이스에 선언된 추상메소드를 모두 실체 메소드를 작성해야한다.
* */
public class RemoteControlExample {

    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            private int num;  // 여기 안에서만 사용 가능 rc로 접근할 수 없다.

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int volume) {

            }
        };
    }
}
