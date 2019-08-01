package chap15.sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(100);



        Integer score = null;
        score = scores.first();
        System.out.println("가장 낮은 점수: " + score);

        score = scores.last();      //가장 오른쪽에 있는 객체
        System.out.println("가장 높은 점수: " + score);


        //부모노드- 왼쪽 아래에 있는 객체
        score = scores.lower(95);
        System.out.println("95점 아래 있는 점수: " + score);


        score = scores.higher(95);
        System.out.println("95점 위에 있는 점수: " + score);

        score = scores.floor(95);
        System.out.println("95점이거나 바로 아래 점수 : " + score);
        //floor와 lower의 차이 :
        // floor : 95가 없다면 95보다 바로 아래있는 점수 리턴

        score = scores.ceiling(85);
        System.out.println("85점 이거나 위의 점수 :" + score);


        /**pollLast / pollFirst */

        /*
        while(!scores.isEmpty()) {
            score = scores.pollFirst();
            //이진트리에서 제일 왼쪽 자식 노드객체부터 빼낸다.
            //treeset에서 제거
            System.out.println(score +" 남은 객체수:"+ scores.size() );
        }
*/
        //제거 하지 않음

        /*Iterator<Integer> iterator = scores.iterator();
        while(iterator.hasNext()) {
            int s = iterator.next();
            //같은 결과 내고 싶으면
            //iterator.remove();
            System.out.println(s);
        }*/



    }

}
