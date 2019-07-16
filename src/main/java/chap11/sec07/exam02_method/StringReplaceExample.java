package chap11.sec07.exam02_method;
/**문자열 대치하기*/
public class StringReplaceExample {

    public static void main(String[] args) {
        String oldStr= "자바는 객체지향언어 입니다.";
        String newStr = oldStr.replace("자바","JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }

}
