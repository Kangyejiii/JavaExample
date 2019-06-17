package Chap2.sec02.exam02_char;

public class CharExample {

    public static void main(String[] args){


    char var1='A';
    char var2=65;
    char var3='\u0041';
    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);

    char var4='가';
    char var5= 44032 ; //10진수로 저장

        int unicode=var4;
    System.out.println(var4);

    var4++;
    System.out.println(var4);
    System.out.println(unicode);
    }
}
