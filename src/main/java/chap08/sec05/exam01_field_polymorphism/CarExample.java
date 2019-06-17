package chap08.sec05.exam01_field_polymorphism;
//실행클래스
public class CarExample {

    public static void main(String[] args) {

        Car myCar = new Car();      //객체생성성        myCar.run();


        System.out.println("----------");
        //한국타이어 --> 금호 타이어로 바꾸기
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    }

}
