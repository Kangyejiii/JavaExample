package Chap6.sec08.exam01_method_declaration;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int[] num = {1,2,3};
        int result1 = myCom.sum1(num);
        System.out.println(result1);


        int result2 = myCom.sum1(new int[]{2,3,4});
        System.out.println(result2);


        int result3 = myCom.sum2(1,2,3,4);
        System.out.println(result3);
    }
}
