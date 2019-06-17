package Chap3.sec04.exam01_arithmetic;

public class AccuracyExample1 {
    public static void  main(String[] args){
        /*int apple =1;
        double pieceUnit =0.1;
        int number =7;

        double result =apple - number*pieceUnit;
        System.out.println(result);     //0.299999999..
        */
        int apple =1;
        int totalPieces=apple*10;
        int number =7;

        int temp=totalPieces-number;

        double result =temp/10.0;
        //double result =apple - number*pieceUnit;
        System.out.println(result);



    }
}
