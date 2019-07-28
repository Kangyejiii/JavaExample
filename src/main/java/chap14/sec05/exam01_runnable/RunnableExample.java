package chap14.sec05.exam01_runnable;

public class RunnableExample {

    public static void main(String[] args) {
       /*
       자주쓰진 않는다. runnable 객체를 만들어주고 대입
        Runnable runnable = () -> {
            for (int i = 0; i < 10 ; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start(); */


        Thread thread = new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                System.out.println();
            }
        });
        thread.start();
    }

}
