package chap7.sec08.exam02_abstarct_method;

public class Dog extends Animal {

    public Dog() {
        this.kind = "포유류";
    }
    @Override
    public void sounds() {
        System.out.println("멍멍");
    }
}
