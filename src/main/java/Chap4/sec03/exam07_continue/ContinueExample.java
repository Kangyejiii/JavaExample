package Chap4.sec03.exam07_continue;

public class ContinueExample {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
          if(i%2!=0){
              continue;
          }
            System.out.println(i);//홀수는 실행되지 않는다.
        }
    }
}
