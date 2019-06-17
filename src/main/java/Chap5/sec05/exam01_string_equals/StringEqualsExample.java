package Chap5.sec05.exam01_string_equals;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVal1 = "강예지";
        String strVal2 = "강예지";


        if(strVal1==strVal2){
            System.out.println("참조하는객체 일치");
        }else{
            System.out.println("참조하는객체다릅니다");
        }

        if(strVal1.equals(strVal2)==true){
            System.out.println("문자열이 같다");
        }else{
            System.out.println("문자열이 같지않다");
        }

        String strVal3= new String("강예지");

        if(strVal1==strVal3){
            System.out.println("참조하는객체 일치");
        }else{
            System.out.println("참조하는객체다릅니다");
        }


        if(strVal1.equals(strVal3)==true){
            System.out.println("문자열이 같다");
        }else{
            System.out.println("문자열이 같지않다");
        }

        strVal2="가나다";

        if(strVal1==strVal2){
            System.out.println("참조하는객체 일치");
        }else{
            System.out.println("참조하는객체다릅니다");
        }

        strVal1=strVal2;

        System.out.println("strval2"+strVal2);
        System.out.println("strVal1"+strVal1);

        strVal2="나나나";

        System.out.println("strval2"+strVal2);
        System.out.println("strVal1"+strVal1);


        if(strVal1==strVal2){
            System.out.println("참조하는객체 일치");
        }else{
            System.out.println("참조하는객체다릅니다");
        }








    }


}
