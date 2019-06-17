package Chap6.sec08.exam03_method_call;

public class Calculator {

    int plus(int x, int y){
        int result = x+y;
        return result;
    }

    double avg(int x, int y){
        double sum = plus(x,y);
        double result = sum / 2 ;
        return result;

    }

    void execute(){
        double result = avg(10,7);
        //System.out.println("실행결과: "+result);
        println("실행결과: "+result);
    }
    void println(String message){
        System.out.println(message);
    }
}
