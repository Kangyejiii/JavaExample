package chap11.sec07.exam02_method;

public class StringCharAtExample {

    public static void main(String[] args) {
        String ssn ="123456-2233323";
        char num = ssn.charAt(7);
        switch (num) {

            case '1': case '3': {
                System.out.println("남자입니다");
                break;
            }
            case '2': case '4': {
                System.out.println("여자입니다");
                break;
            }
        }


    }

}
