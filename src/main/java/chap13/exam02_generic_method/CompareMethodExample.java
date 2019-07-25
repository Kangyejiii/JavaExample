package chap13.exam02_generic_method;

public class CompareMethodExample {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1,"사과");
        Pair<Integer, String> p2 = new Pair<>(1,"사과");

       boolean result1 =Util.compare(p1,p2);

        System.out.println(result1);

    }

}
