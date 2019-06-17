package chap7.sec07.exam05_method_polymorphism;

public class Driver {

    public void drive(Vehicle vehicle) {
        vehicle.run();
    }

    //다양한 객체가 들어올 수 있는것 Vehicle의 자식객체도 사용 가능하다
    // 자식 객체가 run() 메소드를 재정의 했다면 자식객체의 run() 호출

}
