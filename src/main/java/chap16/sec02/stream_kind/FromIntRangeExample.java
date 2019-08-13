package chap16.sec02.stream_kind;

import java.util.stream.IntStream;

public class FromIntRangeExample {

    public static int sum;


    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1 , 100);
        intStream.forEach(a ->sum += a );
        System.out.println("1부터 100까지 총합 " + sum);
    }
}
