package Chap5.sec06.exam04_main_argument;

public class MainStringArrayExample {
    public static void main(String[] args) {
        System.out.println("배열의 길이: " + args.length);


        //java MainStringArrayExample abc(->인덱스0) def
        // new String[] {"abc","def"}

        if(args.length != 2){
            System.out.println("프로그램 사용볍");
            System.out.println("java MainStringArrayExample num1 num2");
            System.exit(0); //jvm 종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int intNum1 = Integer.parseInt(strNum1);
        int intNum2 = Integer.parseInt(strNum2);

        int result = intNum1 + intNum2;
        System.out.println(result);

    }
}
