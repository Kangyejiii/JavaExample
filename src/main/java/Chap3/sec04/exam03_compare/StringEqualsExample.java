package Chap3.sec04.exam03_compare;

public class StringEqualsExample {
    public static void main(String[] args){
        String str1 = "강예지";
        String str2 = "강예지";
        String str3;
        str3 = new String("강예지");


        System.out.println("str1==str2"+str1==str2);    //번지수비교
        System.out.println("str2==str3"+str2==str3);

        System.out.println(str3.equals(str2));  //true문자열비교





    }
}
