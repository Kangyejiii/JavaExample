package Chap4.sec03.exam06_break;

public class BreakExample {
    public static void main(String[] args) {
        while(true){
            int num=(int)(Math.random()*6)+1;
            System.out.println(num);
            if(num==6){
                break;
            }
        }//end while

        System.out.println("프로그램 종료");
    }
}
