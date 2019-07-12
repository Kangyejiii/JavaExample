package chap11.sec03.exam04_clone;

public class MemberExample {

    public static void main(String[] args) {
        Member original = new Member("blue","홍길동","12345",25,true);

        System.out.println("원본 객체의 필드값");
        System.out.println(original);

        Member cloned = original.getMember(); //다른 객체지만 정보는 같음
        cloned.password = "3333";
        System.out.println("복제 객체의 필드값");
        System.out.println(cloned);

    }

}
