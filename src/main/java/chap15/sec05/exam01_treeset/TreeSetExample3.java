package chap15.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();


       NavigableSet<String> rangeSet = treeSet.subSet("c",true,"f",true);

       for(String word : rangeSet) {
           System.out.println(word);
       }

    }

}
