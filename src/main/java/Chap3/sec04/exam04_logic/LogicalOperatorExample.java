package Chap3.sec04.exam04_logic;
/*
* 논리 연산자
* */
public class LogicalOperatorExample {
    public static void main(String[] args){
       int charCode = '6';

       if((charCode>=65)&&(charCode<=90)){
           System.out.println("대문자");

       }
       if((charCode>=97)&&(charCode<=122)){
           System.out.println("소문자");
       }
        if(!(charCode<48)&& !(charCode>57)){
            System.out.println("0~9숫자");
        }

        int value = 6;
        if((value%2==0)||(value%3==0)){
            System.out.println("2또는3의 배수이다");
        }
    }
}
