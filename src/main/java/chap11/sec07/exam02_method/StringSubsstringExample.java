package chap11.sec07.exam02_method;

public class StringSubsstringExample {

    public static void main(String[] args) {
        String ssn = "001234-3456789";
        String firstNum = ssn.substring(0,6);
        String secondNum = ssn.substring(8);

        System.out.println(firstNum);
        System.out.println(secondNum);
    }

}
