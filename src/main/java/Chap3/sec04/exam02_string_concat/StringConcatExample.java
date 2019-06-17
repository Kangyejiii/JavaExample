package Chap3.sec04.exam02_string_concat;

public class StringConcatExample {
    public static void main(String[] args){

        String str2 = "sdk"+5.1+5.0;    //문자열 연결 연산자
        String str3= str2+6;
        String str4 = 5+6.0+"version";
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str4);   //11.0version
        /*
        * str2 sdk5.1 + 5.0 이라 문자열 연결  sdk5.15.0
        * 진행방향이 -> 이방향이라 5+6.0=11.0 산술연산후 문자열 연결
        *
        * */


    }
}
