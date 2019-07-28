package chap14.sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
    private  static List<Student> list = Arrays.asList(
            new Student("a",100,95),
            new Student("b",80,90)
    );


    public static void printString(Function<Student, String> function) {
        //학생 객체를 String으로 매핑하여
        for(Student student : list) {
            //2번돌게 되있음 a 학생객체,b 학생 객체
            System.out.print(function.apply(student)+ " ");
            //Function<Student>라고썼으니 매개값으로 Student student 객체 써야함

        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {
        for(Student student : list) {
            //2번돌게 되있음 a 학생객체,b 학생 객체
            System.out.print(function.applyAsInt(student)+ " ");
            //            //학생객체를 대입! 정수값을 리턴
        }
        System.out.println();
    }

    public static double printAvg(ToIntFunction<Student> function){
        int sum = 0;
        for(Student student : list){
             sum+=function.applyAsInt(student);
        }
        double avg = (double) sum /list.size();
        return  avg;
    }

    public static void main(String[] args) {
        System.out.println("학생이름");
        printString(t->t.getName());//리턴값은 getname


        System.out.println("영어점수");
        printInt(t->t.getEnglishScore());

        double englishAvg = printAvg(t->t.getEnglishScore());
        System.out.println(englishAvg);



    }

}
