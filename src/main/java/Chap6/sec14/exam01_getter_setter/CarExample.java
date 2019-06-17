package Chap6.sec14.exam01_getter_setter;

public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car();
/*
        //필드값 수정
        myCar.setSpeed(-60);
        myCar.setStop(false);


        //필드값 읽기
        System.out.println(myCar.getSpeed());
        System.out.println(myCar.isStop());*/



        myCar.setSpeed(-60);
        System.out.println("현재속도:"+myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재속도:"+myCar.getSpeed());

        if(!myCar.isStop()){//stop이 아니라면 실행
            myCar.setStop(true);
        }

        System.out.println("현재속도:"+myCar.getSpeed());
        System.out.println(myCar.isStop());
        //stop 인데도 불구하고 속도는 60! (setter 수정) setStop()메소드 수정




    }
}
