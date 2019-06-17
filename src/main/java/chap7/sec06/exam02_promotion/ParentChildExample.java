package chap7.sec06.exam02_promotion;

public class ParentChildExample {

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.method1();
        parent.method2();   //재정의된 메소드가 호출
        ((Child) parent).method3();//method3 은 child에서 만들어진 메소드
    }


}
