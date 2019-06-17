package chap08.sec05.exam01_field_polymorphism;

public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    //한국타이어 or 금호타이어 (구현객체가 달라도문제없이) 둘중 아무거나 해도 roll() 실행
    public void run() {
        frontLeftTire.roll();//roll()추상메소드호출
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
