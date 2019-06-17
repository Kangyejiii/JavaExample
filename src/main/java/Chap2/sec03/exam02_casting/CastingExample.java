package Chap2.sec03.exam02_casting;

public class CastingExample {
    public static void main(String[] args) {

        int intValue = 44032;
        char charValue = (char)intValue;
        System.out.println(charValue);      //가

        long longValue = 500;   //500을 8byte에 저장
        //intValue = longValue  컴파일에러
        intValue = (int)longValue; //강제형변환하면 컴파일에러가 나지 않음
        System.out.println(intValue);       //500

        double doubleValue = 3.14 ; //실수형
        intValue = (int)doubleValue;
        System.out.println(intValue);   //3



    }


}
