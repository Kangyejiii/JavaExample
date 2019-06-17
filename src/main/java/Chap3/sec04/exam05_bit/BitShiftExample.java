package Chap3.sec04.exam05_bit;

public class BitShiftExample {
    public static void main(String[] args){

        System.out.println("1<<4="+(1<<4));
        System.out.println("-32>>4="+(-32>>4));
        System.out.println("-8>>>3="+(-8>>>3));

        System.out.println(toBinaryString(-8));

    }

    public static String toBinaryString(int value){
        String str=Integer.toBinaryString(value);

        while(str.length()<32){
            str="0"+str;
        }

        return str;
    }
}
