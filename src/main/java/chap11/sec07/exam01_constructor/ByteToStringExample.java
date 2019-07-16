package chap11.sec07.exam01_constructor;

/** 바이트 배열을 문자열로 변환*/

public class ByteToStringExample {

    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97} ;

        String str1 = new String(bytes);
        System.out.println(str1);
        String str2 = new String(bytes,0,5);
        System.out.println(str2);
    }

}
