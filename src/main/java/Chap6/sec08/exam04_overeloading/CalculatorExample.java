package Chap6.sec08.exam04_overeloading;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalcu = new Calculator();

        double result1 = myCalcu.areaRectangle(10);
        double result2 = myCalcu.areaRectangle(3.0,4.0);

        System.out.println(result1+","+result2);
    }
}
