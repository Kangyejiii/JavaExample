package chap08.sec04.exam01_abstract_method_use.exam01_name_implement_class;

/*
* RemoteControl의 추상메소드를 재정의 하지 않을 경우 오류!
* 메서드 오버라이드 구현 : Ctrl + O
* */
public class Television implements RemoteControl {
    private  int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다..");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV 볼륨 :" + this.volume );

    }
}
