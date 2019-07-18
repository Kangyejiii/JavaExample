package chap12.sec02.exam01_createthread;
/*소리와 띵 문자열이 동시에 된다.*/
import java.awt.*;

public class BeepPrintExample3 {

    public static void main(String[] args) {
       //how1 하위 클래스만들어서
       /* Thread thread = new BeepThread();
        thread.start();
        */


       //how2 익명 객체
       Thread thread = new Thread() {
           @Override
           public void run() {
               //비프음을 5번 반복해서 소리나게 하는 작업
               Toolkit toolkit = Toolkit.getDefaultToolkit();
               for (int i = 0; i < 5 ; i++) {
                   toolkit.beep();
                   try {
                       Thread.sleep(500);
                   } catch (Exception e) { }
               }
           }
       };

       thread.start();



        //*띵* 문자열을 5번 출력하는 작업
        for (int i = 0; i < 5 ; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) { }
        }

    }

}
