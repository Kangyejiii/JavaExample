package chap16.sec02.stream_kind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {

    public static void main(String[] args) {
        String[] strArray = {"학생A","학생B"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(s-> System.out.println(s+","));
        System.out.println();
        //Arrays.stream 정적 메소드


        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        //intStream.forEach(a-> System.out.println(a));
        intStream.forEach(System.out :: println);
    }

}
