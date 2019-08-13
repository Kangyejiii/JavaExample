package chap16.sec11.stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

    public static void main(String[] args) {

        List <Student> totalList = Arrays.asList(
                new Student("학생A",10 , Student.Sex.MALE),
                new Student("학생B",6 , Student.Sex.FEMALE),
                new Student("학생C",10 , Student.Sex.MALE),
                new Student("학생D",6 , Student.Sex.FEMALE)
        );


        //남학생들만 묶어 list 만들기!
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex() == Student.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(s-> System.out.println(s.getName()));


        System.out.println();

        //여학생들만 묶어 HashSet생성
        Set<Student> femaleSet =totalList.stream()
                .filter(s->s.getSex() == Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));

        femaleSet.stream()
                .forEach(s-> System.out.println(s.getName()));

    }

}
