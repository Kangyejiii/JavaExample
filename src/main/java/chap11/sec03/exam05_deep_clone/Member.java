package chap11.sec03.exam05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {

    public String name;
    public int age;
    public int[] scores;
    public Car car;     //얕은 복제를 하면 번지를 공유!

    public Member(String name,int age,int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Member cloned = (Member) super.clone();     //Object의 clone()호출 얕은복사
        cloned.scores = Arrays.copyOf(this.scores,this.scores.length);
        cloned.car = new Car(this.car.model);
        return  cloned;
    }
    public Member getMember() {
        Member cloned = null;
        try{
            cloned = (Member) clone();      //재정의된 clone() 메소드 호출
        } catch(CloneNotSupportedException e){}
        return cloned;
        }


}
