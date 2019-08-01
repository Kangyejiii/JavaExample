package chap16.sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("학생a", 90),
                new Student("학생b", 92)
        );

        Stream<Student> studentStream = list.stream();
        studentStream.forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });

    }


}
