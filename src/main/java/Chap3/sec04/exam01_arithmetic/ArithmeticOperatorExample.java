package Chap3.sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {
public static void main(String[] args){
    int v1 = 5;
    int v2 = 2;

    int result = v1 + v2;
    System.out.println("result= "+result);

    int result2 = v1 / v2;
    System.out.println("result2= "+result2);  //2

    int result3 = v1 % v2;
    System.out.println("result3= "+result3);

    double result6 =(double)v1/v2;      //둘중하나가 실수라면 결과값도 실수로 된다.
    System.out.println("result6: " + result6);

    char c1 ='A';
    int result8 = c1 +1;
    System.out.println(result8);

    char c3 =(char)(c1 +1);
    System.out.println(c3);
}

}
