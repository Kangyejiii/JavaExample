package Chap3.sec03.exam02_Increase_decease;

public class IncreaseDescreaseOperaorExample {

    public static void main(String[] args){

        int x = 10;
        int y = 10;
        int z ;

        System.out.println("------------------");
        x++;
        ++x;
        System.out.println("x="+x);

        System.out.println("------------------");
        y--;
        --y;
        System.out.println("y="+y);

        z= x++; //뒤에 있으니깐 12을 먼저 z에 대입 후 x 증가
        System.out.println("z: "+z);
        System.out.println("x: "+x);

        z= ++x;
        System.out.println("z: "+z);        //14
        System.out.println("x: "+x);        //14

        System.out.println("------------------");
        z= ++x + y++;
        System.out.println(z); //x먼저 증가 15 , y= 8 23


    }
}
