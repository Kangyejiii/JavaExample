package chap14.sec04.exam02_local_variable;

public class UsingLocalVariable {
    void method(int arg) {
        int localVar = 40;

        //arg= 30;
        //localVar = 50;

        MyFunctionalInterface fi = () -> {
            System.out.println("arg:" + arg );
            System.out.println("localVal: " + localVar);
        };
        fi.method();
    }

    public static void main(String[] args) {
        UsingLocalVariable ulv = new UsingLocalVariable();
        ulv.method(66);
    }
}


