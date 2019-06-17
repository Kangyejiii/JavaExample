package chap7.sec02.exam01_inheritance;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("Power On");
    }

    void powerOff() {
        System.out.println("Power Off");
    }

    void bell() {
        System.out.println("Ring Ring");
    }

    void sendVoice(String message) {
        System.out.println("Me: " + message);
    }


    void receiveVoice(String message) {
        System.out.println("You: " + message);
    }


    void hangUp() {
        System.out.println("End");
    }

}
