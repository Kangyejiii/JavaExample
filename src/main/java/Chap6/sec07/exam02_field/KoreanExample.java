package Chap6.sec07.exam02_field;

public class KoreanExample {

    public static void main(String[] args) {
        Korean k1 = new Korean("강예지","950911-222222");
        Korean k2 = new Korean("아무개","123456-121212");

        System.out.println("k1이름: " +k1.name);
        System.out.println("k1 ssn:"+k1.ssn );
        System.out.println("k1 국가"+ k1.nation);
        System.out.println();
        System.out.println("k2이름: " +k2.name);
        System.out.println("k2 ssn:"+k2.ssn );
        System.out.println("k2 국가"+k2.nation);
    }


}
