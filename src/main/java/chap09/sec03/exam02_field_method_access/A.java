package chap09.sec03.exam02_field_method_access;

// TODO: 2019-06-20 [9장 중첩클래스] 멤버 클래스에서 사용 제한

public class A {
    int field1;
    void method1() { }

    static int field2;
    static void method2() { }

    /**중첩 클래스**/
    class B {

        void method() {
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    static class C {

        void method() {
            //field1 = 10;
            //method1();

            field2 = 10;        //A 객체가 없어도 사용 가능한 static 필드 메소드
            method2();
        }
    }

}
