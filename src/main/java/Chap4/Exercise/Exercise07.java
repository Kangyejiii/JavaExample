package Chap4.Exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args)throws Exception {
        boolean run = true;

        int balance = 0;
        Scanner scanner =new Scanner(System.in);
        int input=0;

        while(run){

            System.out.println("----------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------");
            System.out.print("선택>");


            int menuNum=scanner.nextInt();


            if (menuNum == 1) {
                System.out.print("예금액>");
                /*input=scanner.nextInt();
                balance+= input;*/
                balance += scanner.nextInt();

            } else if (menuNum == 2) {
                System.out.print("출금액>");
                balance -= scanner.nextInt();

                /*input=scanner.nextInt();
                balance-= input;*/


            } else if (menuNum == 3) {
                System.out.println(balance);

            } else if (menuNum == 4) {
                run = false;
            }
        }//while end
        System.out.println("프로그램 종료");
    }
}
