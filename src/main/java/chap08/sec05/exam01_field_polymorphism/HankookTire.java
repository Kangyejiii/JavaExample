package chap08.sec05.exam01_field_polymorphism;

public class HankookTire implements Tire{

    @Override
    public void roll() {
        System.out.println("한국타이어가 데굴데굴");
    }
}
