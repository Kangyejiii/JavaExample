package chap09.sec05.exam02_anonymous_Implements;
/**익명 구현 클래스와 객체 생성**/
public class AnonymousExample {

    public static void main(String[] args) {
          Anonymous anony = new Anonymous();

          //anony.field : RemoteControl(인터페이스)의 구현객체
        //인터페이스의 추상메소드 호출
        anony.field.turnOn();
        anony.field.turnOff();

        anony.method1();

        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV TurnOn");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTV TurnOFF");
            }
        });
    }

}
