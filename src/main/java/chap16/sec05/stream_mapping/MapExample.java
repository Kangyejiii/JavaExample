package chap16.sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("학생A",50),
                new Student("학생B",100),
                new Student("학생C",55)
        );

        studentList.stream()
                .mapToInt(s->s.getScore())  //정수 스트림으로 대체
                .forEach(score-> System.out.println(score));

    }

}
