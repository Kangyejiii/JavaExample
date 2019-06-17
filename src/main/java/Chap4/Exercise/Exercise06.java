package Chap4.Exercise;

public class Exercise06 {
    public static void main(String[] args) {
        String star="*";
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(star);
                if(i==j){
                    System.out.println();
                    break;}

            }

        }

    }
}
