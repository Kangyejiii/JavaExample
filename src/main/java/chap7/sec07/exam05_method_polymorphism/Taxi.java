package chap7.sec07.exam05_method_polymorphism;
/*
* Ctrl+ o Override
* */
public class Taxi extends Vehicle {

    //run() 메소드 재정의
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
