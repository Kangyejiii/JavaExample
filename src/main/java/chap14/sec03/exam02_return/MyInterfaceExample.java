package chap14.sec03.exam02_return;

import chap14.sec03.exam02_return.MyFunctionalInterface;

public class MyInterfaceExample {

    public static void main(String[] args) {
        MyFunctionalInterface fi= (x,y) -> x+y;
        System.out.println(fi.method(3,2));
        /*fi = (x,y) ->{ int sum =x+y;
                        return sum;};

        System.out.println(fi.method(2,3));


        fi = (x,y) -> x*y;
        System.out.println(fi.method(3,6));
*/

    }

}
