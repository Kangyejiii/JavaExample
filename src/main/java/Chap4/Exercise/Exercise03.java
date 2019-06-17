package Chap4.Exercise;
/*
* for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드작성
* */
public class Exercise03 {
    public static void main(String[] args) {
        int sum=0;
        for(int i= 0;i<=100;i++){
            if(i%3!=0){
                continue;
            }
            sum+=i;

        }
        System.out.println("3의 배수 의 합:"+sum);
    }
}
