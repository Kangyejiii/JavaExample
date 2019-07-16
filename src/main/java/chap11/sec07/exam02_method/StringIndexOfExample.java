package chap11.sec07.exam02_method;
/** 문자열 포함 여부 조사 */
public class StringIndexOfExample {

    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("자바");
        System.out.println(location);

        if(location != -1 ) {
            System.out.println("자바와 관련된 책!");
        } else {
            System.out.println("자바와 관련없는 책");
        }
   }

}
