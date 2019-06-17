package chap7.sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {

        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행~");
        } else {
            super.fly();
        }

        /*super.fly();
        System.out.println("초음속 비행모드로 변경합니다.");
        System.out.println("초음속 비행합니다.");*/
    }
}
