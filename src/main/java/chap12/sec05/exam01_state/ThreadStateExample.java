package chap12.sec05.exam01_state;

public class ThreadStateExample {

    public static void main(String[] args) {
       StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());

       statePrintThread.start();    //run()메소드 시작

    }

}
