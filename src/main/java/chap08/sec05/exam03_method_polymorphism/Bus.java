package chap08.sec05.exam03_method_polymorphism;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus run");
    }
}
