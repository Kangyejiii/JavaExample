package Chap6.sec07.exam04_other_constructor_call.exam03_constructor_overloading;
/*
* 생성자 오버로딩(Overloading)
* 다른생성자를 호출하는 this는 생성자의 첫번째 줄에 작성되어야한다..
* */
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){

    }
    Car(String model){
        /**
         * this.model= model;
         * this.color = null;
         * this.maxSpeed = 0;
         */
        this(model,null,0);
    }
    Car(String model,String color){
//        this.model = model;
//        this.color = color;
        this(model,color,0);
    }
    Car(String model,String color,int  maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
