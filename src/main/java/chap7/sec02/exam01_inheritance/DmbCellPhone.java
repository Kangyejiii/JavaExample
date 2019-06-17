package chap7.sec02.exam01_inheritance;

public class DmbCellPhone extends CellPhone {
    int channel;

    public DmbCellPhone(String model, String color, int channel) {
        this.model = model;
        this.color = color;
        this.channel = channel;
    }


    void turnOnDmb(){
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    void changeChannelDmb(int channel){
        System.out.println("채널" + channel + "번 바꿉니다");
    }
    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}
