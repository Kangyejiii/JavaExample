package chap08.sec05.exam02_field_array;

public class Car {
    //배열로 바꾸기
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    //한국타이어 or 금호타이어 (구현객체가 달라도문제없이) 둘중 아무거나 해도 roll() 실행
    public void run() {

        for (Tire tire : tires) {
            tire.roll();
        }
    }
}
