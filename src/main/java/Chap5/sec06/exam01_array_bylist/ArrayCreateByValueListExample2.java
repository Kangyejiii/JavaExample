package Chap5.sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores=new int[] {20,30,40,50,50};
        int sum1 = 0 ;
        for(int i=0;i<3;i++){

            sum1+=scores[i];
        }
        System.out.println("합: " +sum1);
        System.out.println("합 " +add(scores));
        System.out.println(add(new int[]{1,2,3}));
    }

    public static int add(int[]score){
        int sum = 0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }

        return sum;
    }
}
