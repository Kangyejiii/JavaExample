package chap16.sec06.stream_sortind;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortingExample {

    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{5,3,4,1,2});

        intStream.sorted()
                .forEach(n-> System.out.print(n+" "));

    }

}
