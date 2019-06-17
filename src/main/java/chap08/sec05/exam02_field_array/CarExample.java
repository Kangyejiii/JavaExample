package chap08.sec05.exam02_field_array;

//실행클래스
public class CarExample {

    public static void main(String[] args) {

        Car myCar = new Car();      //객체생성성        myCar.run();


        System.out.println("----------");
        //한국타이어 --> 금호 타이어로 바꾸기
        myCar.tires[0] = new KumhoTire();

        myCar.run();
    }

}
