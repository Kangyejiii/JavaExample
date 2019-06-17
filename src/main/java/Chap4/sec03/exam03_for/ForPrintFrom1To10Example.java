package Chap4.sec03.exam03_for;

public class ForPrintFrom1To10Example {
    public static void main(String[] args) {
        /*for(int i=1;i<=10;i++){
            System.out.println(i);
        }*/
        int sum=0;
        int i=0;
        for(i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(i);  //101
        System.out.println("1~100까지 합"+sum);
    }
}
