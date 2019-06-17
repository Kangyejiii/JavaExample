package Chap4.sec02.exam01_if;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20)+81 ;    //81<=범위<101
        String grade;
        System.out.println("점수: " + score);

        if(score>=90){
            if(score>=95){
                grade = "A+";
            }else{
                grade = "A";
            }


        }else{//90보다 작을경우
            if(score>=85){
                grade="B+";
            }else{
                grade="B";
            }

        }

        System.out.println("등급"+grade);

    }


}
