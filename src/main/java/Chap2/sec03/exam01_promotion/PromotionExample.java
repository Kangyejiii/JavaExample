package Chap2.sec03.exam01_promotion;

public class PromotionExample {
    //자동 타입 변환 연습
    public static void main(String[] args){

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);       //10

        char charValue = '가';
        intValue = charValue; //2byte -> 4byte  유니코드 값이 저장
        System.out.println(intValue);       //44032


        intValue = 500;
        long longValue = intValue ; //4byte->8byte
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);    //정수형 -> 실수형

        //longValue   //메모리를 적게차지하지만 더 큰 수를 표현가능하기 때문에 형변환가능


    }
}
