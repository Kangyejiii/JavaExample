package chap14.sec06.exam01_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator;

        intBinaryOperator = (a,b) -> Calculator.staticMethod(a,b);
        int result = intBinaryOperator.applyAsInt(3,2);
        System.out.println(result);

        intBinaryOperator = Calculator :: staticMethod;
        result = intBinaryOperator.applyAsInt(3,2);
        System.out.println(result);


        Calculator obj = new Calculator();

        intBinaryOperator = (a,b) -> obj.instanceMethod(a,b);
        System.out.println(intBinaryOperator.applyAsInt(4,5));

        intBinaryOperator = obj ::instanceMethod;
        result = intBinaryOperator.applyAsInt(4,5);
        System.out.println(result);


    }

}
