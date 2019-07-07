package chap09.Exercise.CarTireEngine_04;

public class NestedClassExample {
    public static void main(String[] args){
        Car myCar = new Car();

        //인스턴스 멤버 클래스 객체 생성
        Car.Tire tire =myCar.new Tire();

        //정적 멤버 클래스 객체 생성
        Car.Engine engine = new Car.Engine();
    }
}
