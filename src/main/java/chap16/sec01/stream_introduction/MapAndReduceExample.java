package chap16.sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("학생a", 10),
                new Student("학생b", 20),
                new Student("학생c", 30)
        );

        //student를 int 타입으로  매핑
        //studentList.stream().mapToInt(s->s.getScore());
        double avg =studentList.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        //mapToInt : 중간처리
        //average : 최종 처리

        System.out.println("평균 점수 : "+ avg);
    }

}
