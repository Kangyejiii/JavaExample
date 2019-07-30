package chap14.sec05.exam08_and_or_negate;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

    public static void main(String[] args) {
        IntPredicate intPredicateA = (a) -> a % 2 == 0; //2의 배수
        IntPredicate intPredicateB = (a) -> a % 3 == 0; //3의 배수
        IntPredicate intPredicateAB;


        intPredicateAB = intPredicateA.or(intPredicateB);   //2 또는 3의 배수 인지 검사
        boolean result = intPredicateAB.test(9);
        System.out.println(result);     //true

        intPredicateAB = intPredicateA.and(intPredicateB);  //2의 배수이면서 3의 배수
        result = intPredicateAB.test(9);    //false
        System.out.println(result);

        intPredicateAB = intPredicateA.negate();  //2의 배수가 아니다.! //홀수이다.
        result = intPredicateAB.test(9);    //true
        System.out.println(result);




    }

}
