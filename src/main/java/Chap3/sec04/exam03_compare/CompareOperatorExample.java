package Chap3.sec04.exam03_compare;

public class CompareOperatorExample {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 <= num2);
        System.out.println(result1);    //true

        char c1 = 'A';
        char c2 = 'B';
        //자바는 문자를 유니코드로 저장
        boolean result4 = (c1<c2);
        System.out.println(result4);

        int v2 = 1; //정수
        double v3 =1.0;
        System.out.println(v2==v3);     //true

        double v4=0.1;
        float v5 =0.1f;
        System.out.println(v4==v5); //정밀도 차이가 있기때문에 false
        System.out.println((float)v4==v5);
        System.out.println((int)(v4*10)==(int)(v5*10)); //true
    }
}
