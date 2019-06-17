package Chap2.sec03.exam03_accuracy;

public class FromIntToDouble {
    public static void main(String[] args){
        int num1 = 123456780;
        int num2 = 123456780;

       double num3 = num2;  //자동타입변환
        num2 = (int)num3;

        int result = num1 - num2;
        System.out.println(result);     //      0



    }
}
