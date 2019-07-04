package chap09.sec03.exam04_outterclass_ref;

//  2019-06-20  중첩 클래스에서 바깥 클래스 참조 얻기
/*
 * 바깥클래스.this.필드
* 바깥클래스.this.메소드();
* */
public class Outter {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }

        void print() {
            System.out.println(this.field);
            this.method();

            System.out.println(Outter.this.field);
            Outter.this.method();

        }
    }
}
