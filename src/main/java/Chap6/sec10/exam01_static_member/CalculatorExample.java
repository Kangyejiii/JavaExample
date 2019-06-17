package Chap6.sec10.exam01_static_member;

public class CalculatorExample {
    public static void main(String[] args) {
        int r =10;
        System.out.println("원넓이구하기 >> 반지름->"+r+"넓이>"+r*r*Calculator.pi);
        System.out.println(Calculator.plus(2,3));
        System.out.println(Calculator.minus(3,2));
    }
}
