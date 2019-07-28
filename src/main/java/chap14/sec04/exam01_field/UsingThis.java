package chap14.sec04.exam01_field;

public class UsingThis {
    public int field = 10;

    class Inner {
        int field = 30;

        void method() {
            MyFunctionalInterface fi;
            fi = () -> {
                System.out.println("outterField: " + UsingThis.this.field );
                System.out.println("innerField: " + this.field );
            };
            fi.method();
        }

    }

}
