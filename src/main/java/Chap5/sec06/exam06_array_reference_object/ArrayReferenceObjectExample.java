package Chap5.sec06.exam06_array_reference_object;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0]="java";
        strArray[1]="java";
        strArray[2]=new String("java");

        System.out.println(strArray[0]==strArray[1]);//t
        System.out.println(strArray[0]==strArray[2]);//t
        System.out.println(strArray[2].equals(strArray[1]));//f


    }
}
