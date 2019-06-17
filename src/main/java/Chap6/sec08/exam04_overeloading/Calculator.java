package Chap6.sec08.exam04_overeloading;
/*
* overloading : 클래스 내에 같은 이름의 메소드를 여러개 선언하는 것
* 조건 : 매개 변수의타입, 개수 , 순서 중 하나가 달라야한다.
* */
public class Calculator {

    double areaRectangle(double width){

        return width*width;
    }

    double areaRectangle(double width,double height){

        return width*height;
    }

}
