package chap14.sec05.exam03_supplier;

import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierExample {

    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            /**1부터 6까지 랜덤한 수 구하기*/
            int num = (int) (Math.random()*6)+1;
            //0.0<= x <= 0.9999
            //0.0<=x <= 5.9999
            //1<= x+1 <= 6.999999
            //1부터 6까지
          return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println(num);
    }


}
