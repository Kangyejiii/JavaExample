package Chap5.sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        int[] scores={83, 90, 87};

        System.out.println("scores[0]: "+scores[0]);
        System.out.println("scores[1]: "+scores[1]);
        System.out.println("scores[2]: "+scores[2]);

        int sum = 0;
        for(int i=0;i<3;i++){
            sum+=scores[i];
        }
        System.out.println("총합 : "+sum);
        double avg = (double)sum/3;         //소수점까지 나오게하기

        System.out.println("평균: "+avg);


        String[] names=null;
        names=new String[]{"가","나","다"};
        for(String e:names){
            System.out.print(e+",");
        }
    }
}
