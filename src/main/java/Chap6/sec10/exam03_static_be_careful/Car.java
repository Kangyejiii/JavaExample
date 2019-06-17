package Chap6.sec10.exam03_static_be_careful;
/*todo:정적메소드와 블록 선언시 주의할점
* */
public class Car {
    int speed;

    void run(){
        System.out.println(speed+"으로 달립니다.");
    }

    public static void main(String[] args){
       /*
       이런 코드는 드물다 ->
       같은 클래스안에 있으면 이렇게 작성해도된다?(x)
       speed = 60;
       -> 정적메소드 안에 인스턴스 필드 사용 안된다.*/
       Car myCar =new Car();
       myCar.speed = 60;
       myCar.run();

    }
}
