package Chap4.Exercise;
/*
* while문과 Math.random() 메소드 이용
*
* */
public class Exercise04 {
    public static void main(String[] args) {
        boolean run = true;

        while(run){
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;
            System.out.println("("+dice1+","+dice2+")");

            if(dice1+dice2==5){
                run=false;
            }
        }

    }
}
