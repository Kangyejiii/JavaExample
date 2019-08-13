package chap16.sec08.stream_match;

import java.util.Arrays;

public class MatchExample {

    public static void main(String[] args) {
        int[] intArr = {2, 4, 6};

        //모두가 2의 배수인가?
        boolean result = Arrays.stream(intArr).allMatch(a -> a%2 == 0);
        System.out.println(result); //true

        //하나라도 3의 배수가 있는가
        result=Arrays.stream(intArr).anyMatch(a-> a%3 ==0);
        System.out.println(result);     //true

        //3의 배수가 전혀 없는가?
        result = Arrays.stream(intArr).noneMatch(a-> a%3 == 0);
        System.out.println(result);     //false
    }

}
