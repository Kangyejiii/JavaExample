package chap09.sec02.exam01_nestedclass_object;

//  2019-06-19 9장 중첩 클래스
/*
* 중첩 클래스 : 클래스 멤버로 선언된 클래스
* 해당 클래스에서만 사용하는 클래스와 인터페이스가 필요할 때 활용된다.
 */

/*
* 중첩 클래스의 분류
* 1. 멤버 클래스 클래스 선언 블록에 선언된 클래스
*  - 인스턴스 멤버 클래스
*    =>A 객체를 생성해야만 사용할 수 있는 B 중첩 클래스
*  - 정적 멤버 클래스
*    =>A 클래스로 바로 접근할 수 있는 C 중첩 클래스
*
* 2. 로컬 클래스 : 메소드 실행블록 안에서 선언된 클래스
*                - 메소드 내부에서만 사용됨
*                - 접근제한자 및 static을 붙일수 없다.
* */

public class Main {

    public static void main(String[] args) {

        A a = new A();

        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        A.C c = new A.C();
        c.field1 = 4;
        c.method1();

        A.C.field2 = 3;     //C 객체 없어도 가능
        A.C.method2();

        a.method();

    }
}
