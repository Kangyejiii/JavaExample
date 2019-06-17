package Chap5.Example;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 학생수| 2. 점수입력 | 3. 점수리스트| 4. 분석 | 5. 종료");
            System.out.println("---------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();


            if(selectNo==1){
                System.out.print("학생수를입력하세요 학생수 :");
                studentNum=scanner.nextInt();
                scores=new int[studentNum];
            }else if(selectNo==2){
                if(scores==null){
                    System.out.println("학생수가 입력되어있지않습니다");
                    continue;
                }
                System.out.println("점수입력하세요 ");
                for(int i = 0 ;i<scores.length;i++){
                    System.out.print((i+1)+"번째 점수 : ");
                    int score=scanner.nextInt();
                    scores[i]=score;

                }
            }else if(selectNo==3){
                if(scores==null){
                    System.out.println("학생들의점수가입력되어있지않습니다");
                    continue;
                }
                System.out.println("점수리스트");
                int i = 0;
                for(int score: scores){

                    System.out.println((i+1)+"번째 점수 "+score);
                    i++;
                }
            }else if(selectNo==4){
                if(scores==null){
                    System.out.println("학생들의점수가입력되어있지않습니다");
                    continue;
                }
                int sum=0;
                int max=0;
                double avg;
                /*for(int score : scores){
                    sum+=score;
                }*/

                for(int i=0;i<scores.length;i++){
                   max=(max<scores[i])?scores[i]:max;
                    sum+=scores[i];
                }
                avg=(double)sum/studentNum;
                System.out.println("최고점수: "+max);
                System.out.println("평균점수: "+avg);



            }else if(selectNo==5){
                run=false;
            }
        }
        System.out.println("시스템종료");
    }
}