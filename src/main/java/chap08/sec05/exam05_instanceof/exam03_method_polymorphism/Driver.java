package chap08.sec05.exam05_instanceof.exam03_method_polymorphism;

// TODO: 2019-06-16 인터페이스08_객체 타입 확인(instanceof)
/*
* 강제타입변환(casting)하기 전에 객체타입을 확인하기 위한 연산자
* */
public class Driver {

    public void drive(Vehicle vehicle) {
        if( vehicle instanceof Bus){
            Bus bus = (Bus)vehicle;
            bus.checkFare();    //이 메소드를 사용하기 위해 강제타입변환
        }
        vehicle.run();
    }
}
