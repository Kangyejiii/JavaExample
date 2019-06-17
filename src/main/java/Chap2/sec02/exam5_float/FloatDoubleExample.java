package Chap2.sec02.exam5_float;

public class FloatDoubleExample {
    public static void main(String[] args){

        double var1 = 3.14;
        //float var2 = 3.14; 컴파일에러
        float var2 = 3.14F;

        //정밀도 검사 가수부분 52bit
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;                //0.123456789

        //e 사용하기
        int var6 = 3000000; //10^6
        double var7 = 3e6;
        float var8= 3e6F; //float인 경우 뒤에 f 붙이기

        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

    }
}
