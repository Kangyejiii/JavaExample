package chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("ABC");
        list.add("DDD");
        list.add("ant");
        list.add(2,"DB");

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: "+ skill);
        System.out.println();


        list.remove(2);
        list.remove("ant");

        for(String str : list) {
            String result = str;
            System.out.println(result);
        }

        System.out.println();


        List<String> list1 = Arrays.asList("a", "b", "c");
        for(String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1 , 2, 3);
        for(int value : list2) {
            System.out.println(value);
        }







    }

}
