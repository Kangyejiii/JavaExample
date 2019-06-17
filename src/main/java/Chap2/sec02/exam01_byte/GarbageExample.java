package Chap2.sec02.exam01_byte;

public class GarbageExample {
    public static void main(String[] args){

        byte var1= 125;
        int var2= 125;

        for(int i=0;i<5;i++){

            var1++;
            var2++;
            System.out.println("var1: "+var1+"\tvar2: "+var2);
        }


        /*
        //var1 = var1+1; //할 수 없으니
        var1++;
        System.out.println(var1);//126

        var1++;
        System.out.println(var1);//127

        var1++;
        System.out.println(var1); //과연 128인가?   -> -128 값이 순회하여 다시 -128부터 시작 */
    }
}
