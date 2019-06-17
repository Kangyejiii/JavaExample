package chap7.sec06.exam03_field_polymorphism;

public class KumhoTire extends  Tire{
    //오류나는거는...! Tire의 기본생성자가 없어서

    public KumhoTire(String location, int maxRotation){
        super(location,maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + "KumhoTire수명 : " + (maxRotation-accumulatedRotation) );
            return true;
        } else {
            System.out.println( location + "금호 타이어가 펑크..!!");
            return false;
        }
    }
}
