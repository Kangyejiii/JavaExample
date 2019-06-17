package Chap6.sec08.exam03_method_call;
/*
*외부클래스에서 메소드 호출하기
* 클래스로부터 객체 생성후
* 참조변수와 도트연산자를 이용하여 메소드 호출
* */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();


        myCar.keyTurnOn();

        myCar.run();

        int speed=myCar.getSpeed();
        System.out.println("현재속도 : " + speed);
    }
}
