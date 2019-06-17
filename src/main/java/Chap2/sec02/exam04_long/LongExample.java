package Chap2.sec02.exam04_long;

public class LongExample {
    public static void main(String[] args){

        long var1 = 10;
        long var2 = 20L;  //컴파일러에게 4byte가 아닌 8byte 수로 인식해라

        long var3 = 10000000000L; //컴파일러 에러 나지 않음 L이 없다면 에러

        System.out.println(var1);
        System.out.println(var2);
    }

}
