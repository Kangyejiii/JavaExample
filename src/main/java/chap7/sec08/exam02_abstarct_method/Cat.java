package chap7.sec08.exam02_abstarct_method;

public class Cat extends Animal {

    public Cat() {
        this.kind = "포유류";
    }


    @Override
    public void sounds() {
        System.out.println("야옹");
    }
}
