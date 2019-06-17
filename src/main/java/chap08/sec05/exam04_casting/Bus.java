package chap08.sec05.exam04_casting;

import java.sql.SQLOutput;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("BUS GO GO");
    }

    public void checkFare() {
        System.out.println("승차요금 체크");
    }
}
