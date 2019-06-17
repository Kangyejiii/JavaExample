package chap08.sec05.exam05_instanceof.exam03_method_polymorphism;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus run");
    }

    public void checkFare(){
        System.out.println("승차요금 체크");
    }
}
