package chap7.sec02.exam01_inheritance;

public class DmbCellPhoneExample {

    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","black",10);

        //CellPhone으로부터 상속받은 필드
        System.out.println("model: " + dmbCellPhone.model);
        System.out.println("color: " + dmbCellPhone.color);

        //DmbCellPhone의 필드
        System.out.println("channel: " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요");
        dmbCellPhone.sendVoice("네");
        dmbCellPhone.hangUp();

        //DmbCellPhone의 메소드
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();


    }
}
