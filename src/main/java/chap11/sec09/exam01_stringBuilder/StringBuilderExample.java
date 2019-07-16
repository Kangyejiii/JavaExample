package chap11.sec09.exam01_stringBuilder;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");  //?? index4 위치 전에 2를삽입
        System.out.println(sb.toString());

        sb.setCharAt(4,'7');
        System.out.println(sb.toString());

        sb.replace(6,13,"Book");
        System.out.println(sb.toString());
        //index 6부터 index 13 '전'까지를 book 문자열로 대치

        sb.delete(4,5); //index 4 부터 index5'전'까지 삭제
        System.out.println(sb.toString());


        //버퍼에 있는 것을 String 타입으로 리턴
    }

}
