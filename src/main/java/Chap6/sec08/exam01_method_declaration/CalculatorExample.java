package Chap6.sec08.exam01_method_declaration;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result=myCalc.plus(10,20);  //리턴값을 받을 변수 선언
        System.out.println(result);

        byte x = 10 ;
        byte y = 4 ;        //byte는 int로 자동으로 형변환
        double result2=myCalc.divide(x,y);
        System.out.println(result2);
    }
}
