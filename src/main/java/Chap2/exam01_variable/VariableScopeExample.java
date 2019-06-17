package Chap2.exam01_variable;

public class VariableScopeExample {
    public static void main(String[] args){
    int var1;

    if(true){
        int var2;

        var1=10;    //컴파일 오류 없음
        var2=20;
    }
    var1= 10;   //가능
    //var2 = 10; //컴파일 오류

    for(int i=0;i<1;i++){
        int var3;

        var3=30; //가능 for문 블록 내

    }//for문 end

    }
}
