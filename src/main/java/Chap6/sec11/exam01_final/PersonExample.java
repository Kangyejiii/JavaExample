package Chap6.sec11.exam01_final;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 =new Person("1234-2345","yeji");

        System.out.println(p1.name);
        System.out.println(p1.nation);
        System.out.println(p1.ssn);

        //p1.nation ="china"; (x)
        //p1.ssn="234-234";  (x)

    }
}
