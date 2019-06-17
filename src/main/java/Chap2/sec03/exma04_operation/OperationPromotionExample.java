package Chap2.sec03.exma04_operation;

public class OperationPromotionExample {
    public static void main(String[] args){

        byte byteValue1 = 10;
        byte byteValue2 = 20;

       // byte byteValue3 = byteValue1 + byteValue2 ;  //byte = int + int
       int intValue1 = byteValue1 + byteValue2 ;
       System.out.println(intValue1);   //30

        char charValue1 = 'A';
        char charValue2 =  1;

        //char charValue3 = charValue1 + charValue2 ; 컴파일 에러
        int intValue2 = charValue2 + charValue1;
        System.out.println("유니코드:"+intValue2);      //66
        char charValue3 = (char)intValue2;
        System.out.println("문자: "+charValue3); //B

        int intValue3 = 10;
        int intValue4 =intValue3 / 4 ; //10/4 =2.5(실수)
        System.out.println(intValue4);  //정수 나누기 정수는 무조건 정수 :2

        int intValue5 = 10;
       // int intValue6 = 10 /4.0;    //실수 리터럴이 있으면  무조건 double로 변환 그러니 컴파일에러
        double doubleValue = intValue5/4.0;
        System.out.println(doubleValue);



    }
}
