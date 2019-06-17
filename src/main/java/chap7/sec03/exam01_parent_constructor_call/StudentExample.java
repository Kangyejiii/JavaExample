package chap7.sec03.exam01_parent_constructor_call;

public class StudentExample {

    public static void main(String[] args) {
        Student student = new Student("홍길동","123-123",1);
        System.out.println(student.name + student.ssn + student.studentNo);
    }
}
