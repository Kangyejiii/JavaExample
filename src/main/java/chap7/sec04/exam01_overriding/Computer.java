package chap7.sec04.exam01_overriding;
/*
Ctrl+ o : 메소드 오버라이드 생성
art + Insert setter getter 생성
* */
public class Computer extends  Calculator {

    @Override
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return  Math.PI*r*r;
    }
}

