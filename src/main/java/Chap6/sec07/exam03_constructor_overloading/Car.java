package Chap6.sec07.exam03_constructor_overloading;
/*
* 생성자 오버로딩(Overloading)
* */
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){

    }
    Car(String model){
        this.model = model;
    }
    Car(String model,String color){
        this.model = model;
        this.color = color;
    }
    Car(String model,String color,int  maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
