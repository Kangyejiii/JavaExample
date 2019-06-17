package Chap3.sec04.exam01_arithmetic;

public class InputDataCheckNaNExample {
    public static void main(String[] args){
        String userInput ="5";
        Double val =Double.valueOf(userInput);

        System.out.println(val);
        Double currentValue=1000.0;

        if(Double.isNaN(val)){
            System.out.println("NaN값은 사용할 수 없습니다");
        }else{
            currentValue+=val;
            System.out.println("총 :"+currentValue);
        }


    }
}
