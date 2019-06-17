package Chap3.sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args){
      /* int x= 5;
        double y= 0.0;

        double result= x/y;
        double z=x%y;
        System.out.println(result);     //Infinity
        System.out.println(Double.isInfinite(result));//Infinity일 때 true
        System.out.println(z);      //NaN
        System.out.println(Double.isNaN(z));

        //System.out.println(z+2);    //NaN 데이터엉망!

        //연산하기 전에 y가 0.0인지 확인 또는 z값 점검

        if(Double.isInfinite(z)||Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z+2);
        }
*/

      int x = 5;
      int y = 0;

        try {
            int z=x/y;
            System.out.println("z= " + z);
        }catch (ArithmeticException e){
            System.out.println("0으로나누면 안됨");
        }







    }
}
