package chap14.sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
    private static int[] scores = {90, 80, 70};

    public static int maxormin(IntBinaryOperator operator) {
        int result = scores[0];
        for(int score :scores){
            result = operator.applyAsInt(result, score);
            //result & score 연산 후 int값 result 대입
        }
        return result;

    }



    public static void main(String[] args) {

         int max = maxormin(
                 (a,b) -> {
                     if(a>=b) return  a;
                     else return b;
                 }
         );
        System.out.println("최대값: " + max);


        int min = maxormin(
                (a, b) -> {
                    if(a<=b) return a;
                    else return b;
                }
        );
        System.out.println("최소값:" + min );
    }

}
