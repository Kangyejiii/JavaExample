package chap08.sec05.exam04_casting;

// TODO: 2019-06-16 인터페이스08_강제타입 변환
// 강제 타입 변환(Casting)
//> 인터페이스 타입으로 자동 타입 변환 후, 다시 구현 클래스 타입으로 변환
// * 필요성 : 구현 클래스 타입에  선언된 다른 멤버를 사용하기 위해

public class VehicleExample {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();
        //vehicle.checkFare(); -> 강제타입 필요한 이유

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

    }

}
