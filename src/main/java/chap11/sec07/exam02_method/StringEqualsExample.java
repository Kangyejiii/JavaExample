package chap11.sec07.exam02_method;
/**문자열 비교*/
public class StringEqualsExample {

    public static void main(String[] args) {
        String str1 = new String("블로그");
        String str2 = "블로그";
        String str3 = "블로그";


       // int sss = (str2==str3)?1:-1;
        // System.out.println(sss);

        if(str1 == str2 ){
            System.out.println("같은 객체를 참조");
        } else {
            System.out.println("다른 객체를 참조");
        }

        if(str1.equals(str2)) {
            System.out.println("문자열이 같음");
        } else {
            System.out.println("문자열이 다름");
        }

    }

}
