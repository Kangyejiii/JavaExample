package chap14.sec05.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private  static List<Student> list = Arrays.asList(
            new Student("a","남",100),
            new Student("b","여",100),
            new Student("c","남",90),
            new Student("d","여",80)
    );

    public static double avg(Predicate<Student> predicate){
        //남자 여자  학생 평균 구하기
        int sum = 0;
        int count = 0;

        for(Student student : list) {
            if(predicate.test(student)) {
                count++;
               sum+=student.getScore();
            }
        }
        double avg = (double)sum/count;

        return  avg;
    }


    public static void main(String[] args) {
        double maleAvg = avg(t->t.getSex().equals("남"));
        System.out.println("남자 평균: " + maleAvg);

        double femaleAvg = avg(t->t.getSex().equals("여"));
        System.out.println("여자 평균: " + femaleAvg);

    }



}


