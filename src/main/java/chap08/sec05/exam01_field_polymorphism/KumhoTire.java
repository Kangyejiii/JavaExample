package chap08.sec05.exam01_field_polymorphism;

public class KumhoTire implements Tire {
    //Tire의 추상메소드를 꼭 재정의해줘야해!
    @Override
    public void roll() {
        System.out.println("금호타이어가 데굴데굴");
    }
}
