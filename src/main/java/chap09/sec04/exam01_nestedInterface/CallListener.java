package chap09.sec04.exam01_nestedInterface;

/*중첩 인터페이스이니 Button.  으로 시작함 */
public class CallListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
