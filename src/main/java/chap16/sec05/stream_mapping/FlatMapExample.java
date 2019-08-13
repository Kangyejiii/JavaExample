package chap16.sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("JAVA8 Programming","I am");


        stringList.stream()
                .flatMap(data-> Arrays.stream((data.split(" "))))//여기서 리턴되는 스트림은 요소가 4 개
                .forEach(word-> System.out.println(word));

        System.out.println();

        List<String> inputList = Arrays.asList("10,20,30","40,50");
        inputList.stream()
                .flatMapToInt(data ->{
                    String[] strArray = data.split(",");
                    int[] intArr = new int[strArray.length];
                    for (int i = 0; i < strArray.length ; i++) {
                        intArr[i] = Integer.parseInt(strArray[i].trim());

                    }
                    return Arrays.stream(intArr);
                })
                .forEach(number -> System.out.println(number));

    }

}
