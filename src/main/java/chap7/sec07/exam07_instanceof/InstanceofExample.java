package chap7.sec07.exam07_instanceof;

public class InstanceofExample {
    public static void method1(Parent parent) {
     if(parent instanceof Child) {
         Child child = (Child) parent;
         System.out.println("Child로 변환 성공");
     } else {
         System.out.println("child로 변환되지 않음");
     }

     }

    public static void main(String[] args) {
        Parent parent = new Child();
        method1(parent);
        Parent parent1 = new Parent();
        method1(parent1);
    }
}
