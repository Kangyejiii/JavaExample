package Chap6.example.exercise_17.exercise_16;
// 메소드 오버로딩
public class Printer {

    static  void println(int num){
        System.out.println(num);
    }

    static  void println(double num){
        System.out.println(num);
    }

    static void println(boolean bool){
        System.out.println(bool);
    }

    static void println(String name){
        System.out.println(name);
    }

}
