package chap16.sec01.stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsSteamExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");

        //자바 7 이전 Iterator 이용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Stream이용
        Stream<String> stringStream = list.stream();
        stringStream.forEach(name -> System.out.println(name));
    }

}
