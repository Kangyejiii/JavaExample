package chap09.sec03.exam03_localclass_access;

// 2019-06-20  [9.3.3] 로컬 클래스에서 사용제한
public class Outter {
    //자바 7 이전
    public void method1(final int arg) {
       final int localVariable = 1;      //로컬 변수

        class Inner {

            void method() {
                /*int arg = 10;     -> 복사
                int localVariable =1;*/
                int result = arg + localVariable;

            }

        }
    }

    //자바 8 이후
    public void method2(int arg) {
        int localVariable = 1;      //로컬 변수

        class Inner {
            //복사 위치
            /*int arg = 10;     -> 로컬 클래스 필드에 복사함
               int localVariable = 1;*/

            void method() {

                int result = arg + localVariable;
                //로컬 클래스에서 사용하면 final로 인식

            }
        }
    }
}
