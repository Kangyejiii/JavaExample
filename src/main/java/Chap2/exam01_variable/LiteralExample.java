package Chap2.exam01_variable;

import java.nio.file.spi.FileSystemProvider;

/*
*리터럴(literal) : 소스 코드 내에서 직접 입력된 값
* 0x 또는 0X 로 시작하고 0~9숫자나 a~f A~F로구성된 리터럴은 16진수
*/
public class LiteralExample {
    public static void main(String[] args){
        int var1=10; //정수 타입의 10진수
        System.out.println(var1);

        int var2= 010; // 0으로 시작하면 8진수 1x 8^1 +0x 8^0= 8;
        System.out.println(var2);

        int var3=0x10; //0x 또는 0X 로 시작하고 0~9숫자나 a~f A~F로구성된 리터럴은 16진수 1x16^1 + 0x16^0 = 16
        System.out.println(var3);

        //실수 리터럴
        double var4 = 0.25;
        System.out.println(var4);

        double var5 = 2E5;          //2 x 10^ 5
        System.out.println(var5);   //200000.0

        //문자 리터럴        타입 : char
        char var6='A';  //유니코드 65
        System.out.println(var6);

        char var7 ='예';
        System.out.println(var7);

        //이스케이프 문자 :특수한 기능을 수행하는 문자
        System.out.println("\t들여쓰기");   //들여쓰기 \t
        System.out.println('\t'+"이렇게도씁니다");
        System.out.println("대한\n민국");//줄바꿈       //\r 과 \n 자바에선 같은결과
        System.out.println("this\'민국"); //' 작은따옴표 쓰기 \ 붙이기
        System.out.println("이건"+'\"'+"자바"+'\"');
        System.out.println("가격이\\200입니다");

        char var8='\u0041'; // 유니코드 16진수 41(십진수로는 65) 을 뜻하는 문자
        System.out.println(var8);   //대문자 A var 8에는 A가ㅏ 저장

        //문자열 리터럴  타입:String
        System.out.println("java"+8);//문자열 결합 연산자
        String var9 ="자바";

        //논리 리터럴 true, false  타입 : boolean    ex) boolean isSave=true;
        boolean var10=true;
        boolean var11=false;
        System.out.println(var10);
    }
}
