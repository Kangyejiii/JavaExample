package chap12.sec02.exam01_createthread;
/*소리와 띵 문자열이 동시에 된다.*/
import java.awt.*;

public class BeepPrintExample2 {

    public static void main(String[] args) {
       //how1
       // Runnable beepTask = new BeepTask();
       // Thread thread = new Thread(beepTask);
       // thread.start();

        //how2
        /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5 ; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) { }
                }
            }
        });
        thread.start(); */

        //람다식
        Thread thread = new Thread( ()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5 ; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) { }
            }
        });

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
