package chap7.sec08.exam02_abstarct_method;

// TODO: 2019-04-25 abstract method 추상 메소드
public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨을 쉽니다.");

    }

    public abstract void sounds();
    //실행블록{} 생략 선언부만 작성
    //추상 클래스에서만 추상 메소드 선언 가능

}
