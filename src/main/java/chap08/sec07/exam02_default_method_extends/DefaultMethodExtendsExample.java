package chap08.sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

    public static void main(String[] args) {
        ChildInterface1 ci1 = new ChildInterface1() {
           //ParentInterface 부모 추상메소드 재정의
            @Override
            public void method1() {
                System.out.println("ci1-method1()");
            }
            //ChildInterface1의 추상메소드 재정의
            @Override
            public void method3() {
                System.out.println("ci1-method3()");
            }


        };

        ci1.method1();
        ci1.method2(); //ParentInterface의 method2()
        ci1.method3();

        System.out.println();


        //ChildInterface > method2() 재정의 했음
        ChildInterface2 ci2 = new ChildInterface2() {
            @Override
            public void method3() {
                System.out.println("ci2-method3()");
            }

            @Override
            public void method1() {
                System.out.println("ci2-method1()");
            }
        };

        ci2.method1();
        ci2.method2();  //ChildInterface2-method2 //재정의
        ci2.method3();
        System.out.println();

        ChildInterface3 ci3 = new ChildInterface3() {
            //추상메소드로 했으니 재정의를 해야한다.
            @Override
            public void method2() {
                System.out.println("ci3-method2()");
            }

            @Override
            public void method3() {
                System.out.println("ci3-method3()");
            }

            @Override
            public void method1() {
                System.out.println("ci3-method1()");

            }
        };

        ci3.method1();
        ci3.method2();  //ChildInterface2-method2 //재정의
        ci3.method3();

    }
}
