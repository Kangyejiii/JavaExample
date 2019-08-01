package chap15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(70);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(100);

        //내림차순으로 정렬
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(int score : descendingSet) {
            System.out.print(score + " ");
        }




    }

}
