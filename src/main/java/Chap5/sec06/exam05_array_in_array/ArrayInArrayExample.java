package Chap5.sec06.exam05_array_in_array;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] mathScores=new int[2][3];

        for(int i=0; i<mathScores.length;i++){//2
            for(int k=0;k<mathScores[i].length;k++){//3
                System.out.println("mathScores["+i+","+k+"]= "+mathScores[i][k]);

            }
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0]=new int[2];
        englishScores[1]=new int[3];

        for(int i=0; i<englishScores.length;i++){//2
            for(int k=0;k<englishScores[i].length;k++){//3
                System.out.println("englishScores["+i+","+k+"]= "+englishScores[i][k]);

            }
        }
        System.out.println();

        int[][] scores={{95,80},{50,60,70}};

        for(int i=0; i<scores.length;i++){//2
            for(int k=0;k<scores[i].length;k++){//3
                System.out.println("scores["+i+","+k+"]= "+scores[i][k]);

            }
        }
    }
}
