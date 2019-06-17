package Chap4.sec03.exam03_for;

public class ForMultiplicationTableExample {

   public static void main(String[] args) {
        for(int m=2 ; m <= 9 ; m++) {
            System.out.println("*****"+m+"단****");
            for(int j=1 ; j<=9 ; j++) {
                int result = m*j;
                System.out.println(m + "X" + j + "= " + result);
            }

        }
    }
}
