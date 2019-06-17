package Chap2.sec03.exam02_casting;

public class CheckValueBeforeCasting {
    public static void main(String[] args){

        int i = 125;
        //byte b = i; 1byte  < - 1byte;
        //byte b = (byte) i;      //범위 초과 -128~127
        //System.out.println(b);  //-128 순회한다


        if(i<Byte.MIN_VALUE||i>Byte.MAX_VALUE){
            System.out.println("값 손실이있습니다\n다시확인해주세요");

        }else{
            byte b = (byte) i;
            System.out.println(b);


        }



    }
}
