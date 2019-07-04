package chap09.sec02.exam01_nestedclass_object;

public class A {

    A() {
        System.out.println("A 객체가 생성됨");
    }

    /**인스턴스 멤버 클래스**/
    class B {

        int field1;                         //인스턴스 필드
        //static int field2;                //정적 필드 (X)

        B() {
            System.out.println("B 객체가 생성됨");
        }

        void method1(){}                    //인스턴스 메소드
    }


    /**정적 멤버 클래스**/
    static class C {

        int field1;
        static int field2;                  //정적 필드 선언 가능

        C() {
            System.out.println("C 객체가 생성됨");
        }

        void method1() {}
        static void method2() {}

    }

    void method() {
        /**로컬 클래스**/
        class D {
            int field1;
            //static int field2;            //정적 필드 (X)

            D() {
                System.out.println("D 객체가 생성됨");
            }

            void method1() {}
        }

        D d = new D();
        d.field1 = 3;
        d.method1();

    }

}
