package Chap4.sec02.exam02_switch;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'c';

        switch (grade){
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:
                System.out.println("손님");
                break;


        }

    }

}
