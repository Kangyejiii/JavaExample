package chap08.sec05.exam03_method_polymorphism;

// TODO: 2019-06-16 인터페이스_매개변수의 다형성
/*
* Vehicle 인터페이스를 선언해서 다양한 구현객체 실행가능
* ex) Bus,Taxi
* */
public class Driver {

    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
