package chap08.sec05.exam03_method_polymorphism;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("Taxi RUN");
    }
}
