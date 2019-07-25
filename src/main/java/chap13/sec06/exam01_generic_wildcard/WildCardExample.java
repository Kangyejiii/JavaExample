package chap13.sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName()+"수강생"+ Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {  //학생전용
        System.out.println(course.getName()+"수강생"+ Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
    } //일반인과 회사원

    public static void main(String[] args) {


        Course<Person> personCourse = new Course<>("일반인과정",5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Student> studentCourse =new Course<>("학생과정",5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));


        registerCourse(personCourse);
        registerCourse(studentCourse);
        registerCourseStudent(studentCourse);









        registerCourse(new Course<Person>("일반인 과정", 5));
        registerCourse(new Course<Worker>("근로자 과정", 5));
        registerCourse(new Course<Student>("학생 과정", 5));
        registerCourse(new Course<HighStudent>("고등학생 과정", 5));


        //registerCourseStudent(new Course<Worker> ("근로자 과정",5));
        registerCourseStudent(new Course<Student>("학생 과정", 5));
        registerCourseStudent(new Course<HighStudent>("고등학생 과정", 5));


        registerCourseWorker(new Course<Person>("일반인 과정", 5));
        registerCourseWorker(new Course<Worker>("근로자 과정", 5));
        //registerCourseWorker(new Course<Student> ("학생 과정",5));
        //registerCourseWorker(new Course<HighStudent> ("고등학생 과정",5));







    }

}
