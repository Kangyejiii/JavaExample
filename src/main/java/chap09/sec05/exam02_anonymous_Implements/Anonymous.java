package chap09.sec05.exam02_anonymous_Implements;

public class Anonymous {
    /**필드 초기값으로 대입*/
    RemoteControl field = new RemoteControl(){
       //재정의를 꼭 해야한다.
        @Override
        public void turnOn() {
            System.out.println("TV TurnON");
        }

        @Override
        public void turnOff() {
            System.out.println("TV TurnOFF");
        }

    };

    void method1(){
        /**로컬변수 선언**/
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("AUDIO TurnON");
            }

            @Override
            public void turnOff() {
                System.out.println("AUDIO TurnOFF");
            }
        };

        //로컬 변수 사용
        localVar.turnOn();
        localVar.turnOff();

    }
    //
    void method2(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }

}
