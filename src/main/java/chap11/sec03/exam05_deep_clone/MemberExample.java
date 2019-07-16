package chap11.sec03.exam05_deep_clone;

public class MemberExample {

    public static void main(String[] args) {
        Member original = new Member("홍길동",25,new int[] {90,90},new Car("소나타"));

        Member cloned = original.getMember();

        System.out.println("[원본 객체의 필드값]");
        System.out.println(original.name + original.age + original.car.model);
        System.out.print("scores:");
        for (int i : original.scores){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        cloned.scores[0] = 30;
        cloned.car.model = "그랜저";

        System.out.println("[복제 객체의 필드값]");
        System.out.println(cloned.name + cloned.age + cloned.car.model);
        System.out.print("scores:");
        for (int i : cloned.scores){
            System.out.print(i+" ");
        }

    }

}
