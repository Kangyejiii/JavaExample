package Chap3.sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {
    public static void main(String[] args){
        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1+1;

        System.out.println(toBinaryString(10)+"  >>십진수: "+v1);
        System.out.println(toBinaryString(v2)+"  >>십진수: "+v2);
        System.out.println(toBinaryString(v3)+"  >>십진수: "+v3);
        System.out.println(v3);     //-10
    }

    public static String toBinaryString(int value){
        String str =Integer.toBinaryString(value);
        while(str.length()<32){
            str = "0"+str;

        }
        return str;
    }
}
