package chap16.sec03.stream_pipelines;

import chap16.sec01.stream_introduction.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPpipelinesExample {

    public static void main(String[] args) {

        List<Member> memberList = Arrays.asList(
                new Member("A학생",Member.MALE,20),
                new Member("B학생",Member.MALE,25),
                new Member("C학생",Member.FEMALE,40),
                new Member("D학생",Member.FEMALE,35)
        );

        double average = memberList.stream()
                .filter(m-> m.getSex() == Member.FEMALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println(average);


                memberList.stream()
                .filter(m->m.getSex()==Member.FEMALE)
                .forEach(m-> System.out.println(m.getAge()));
    }
}
