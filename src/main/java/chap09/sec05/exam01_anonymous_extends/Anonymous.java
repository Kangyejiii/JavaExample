package chap09.sec05.exam01_anonymous_extends;

public class Anonymous {
    Person field = new Person(){
        String studentNo;
        void work() {
            System.out.println("출근");
        }

        @Override
        void wake() {
            System.out.println("6시 기상");
            work();
        }
    };

    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책");
            }

            @Override
            void wake() {
                System.out.println("7시 기상");
                walk();
            }
        };

        localVar.wake();

    }   //method1 end

    void method2(Person person) {
        person.wake();
    }




}
