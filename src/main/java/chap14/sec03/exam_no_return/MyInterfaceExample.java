package chap14.sec03.exam_no_return;

public class MyInterfaceExample {

    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x) ->{
            System.out.println(x);
        };



        fi.method(2);


        fi = x -> System.out.println(x+2);
        fi.method(3);

    }

}
