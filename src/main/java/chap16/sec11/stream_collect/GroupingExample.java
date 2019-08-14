package chap16.sec11.stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("학생A",10 , Student.Sex.MALE,Student.City.Seoul),
                new Student("학생B",6 , Student.Sex.FEMALE,Student.City.Pusan),
                new Student("학생C",10 , Student.Sex.MALE,Student.City.Pusan),
                new Student("학생D",6 , Student.Sex.FEMALE,Student.City.Seoul)
        );

        Map< Student.Sex, List<Student> > mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        System.out.println("[남학생]");
        mapBySex.get(Student.Sex.MALE).stream()
                .forEach(s-> System.out.print(s.getName()+" "));

        System.out.println("\n[여학생]");
        mapBySex.get(Student.Sex.FEMALE).stream()
                .forEach(s-> System.out.print(s.getName()+" "));


        //학생객체가 아니라 이름을 받아서 리스트만드는것
        //즉 학생객체를 받아 이름(String)으로 매핑!
        //이름을 어디에다가 넣을것인가. -> 리스트 Collectors.toList()

        Map<Student.City,List<String>> mapByCity = totalList.stream()
                .collect(Collectors.groupingBy(Student::getCity,
                        Collectors.mapping(Student::getName,Collectors.toList())
                        )
                );

        System.out.println("\n[서울]");
        mapByCity.get(Student.City.Seoul).stream()
                .forEach(name -> System.out.print(name + " "));



        System.out.println("\n[부산]");
        mapByCity.get(Student.City.Pusan).stream()
                .forEach(name -> System.out.print(name + " "));

    

    }

}
