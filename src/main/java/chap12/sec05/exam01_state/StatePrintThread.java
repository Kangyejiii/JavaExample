package chap12.sec05.exam01_state;
/** thread 상태  Thread.state */
public class StatePrintThread extends Thread {
    private Thread targetThread;

    public StatePrintThread(Thread targetThread){   //타겟스레드를 받아서 필드에 저장
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        /** BLOKED / NEW / RUNNABLE / THERMINATED / TIMED_WAITING /WAITING*/

        while (true) {
            State state = targetThread.getState();  //상태를 얻어내고
            System.out.println("타겟 스레드 상태:" + state);   //출력

            if(state == State.NEW) {
                targetThread.start();   //targetThread-run()메소드 시작
            }

            if(state == State.TERMINATED)   break;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
        }
    }
}
