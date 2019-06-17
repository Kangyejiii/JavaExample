package Chap6.sec14.exam01_getter_setter;

// TODO: 2019-04-18 getter&setter
/*
* setter : 유효성 검사
* */
public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed(){
        return speed;
    }

    //set 이 없으면 오로지 읽기전용이 된다.
    public  void setSpeed(int speed){
        if(speed<0) {
            this.speed = 0;
        }else {
            this.speed = speed;
        }
    }

    public boolean isStop(){
        return stop;
    }

    public void setStop(boolean stop){
        this.stop = stop;
        if(stop==true){
            speed = 0;
        }
    }
}
