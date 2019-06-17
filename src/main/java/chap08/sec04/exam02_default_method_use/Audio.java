package chap08.sec04.exam02_default_method_use;

/*
* RemoteControl의 추상메소드를 재정의 하지 않을 경우 오류!
* 메서드 오버라이드 구현 : Ctrl + O
* */
public class Audio implements RemoteControl {
    private  int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다..");
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

        System.out.println("현재 Audio 볼륨 :" + this.volume );

    }

    @Override
    public void setMute(boolean mute) {
        this.mute = mute;       //없어도 된다..
        if (mute) {
            System.out.println("Audio 무음 처리.");
        } else {
            System.out.println("Audio 무음 해제.");
        }
    }
}
