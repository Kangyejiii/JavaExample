/** .stream()
 *  .forEach()  */

package chap16.sec02.stream_kind;

import chap16.sec01.stream_introduction.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(

                new Student("A학생",15),
                new Student("B학생",20),
                new Student("C학생",30)
        );

        Stream<Student> studentStream = studentList.stream();
        studentStream.forEach(s-> System.out.println(s.getName()));


    }

}
