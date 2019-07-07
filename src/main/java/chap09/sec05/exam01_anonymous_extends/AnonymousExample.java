package chap09.sec05.exam01_anonymous_extends;

public class AnonymousExample {

    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.wake();

        anony.method1();    //메소드 내 익명 자식 객체 선언

        anony.method2(new Person(){

            void study() {
                System.out.println("스터디");
            }

            @Override
            void wake() {
                System.out.println("9시 기상");
                study();
            }
        });
    }
}
