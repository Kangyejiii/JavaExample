package chap12.sec07.exam01_daemon;
/**데몬 스레드
 * setDaemon()은 start()전에 호출해야합니다.*/
public class DaemonExample {

    public static void main(String []args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드 종료 ");
    }
}
