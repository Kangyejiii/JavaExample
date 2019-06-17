package Chap3.sec03.exam01_sign;

public class SignOperationExample {
    public static void main(String[] args){

        int x = 100;
        int result1 = +x;
        int result2 = -x;

        short s = 100;
        //short result3 = -s; -s는 4바이트 int형
        int result3 = -s;
        System.out.println(result3);    //-100
    }
}
