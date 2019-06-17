package chap7.sec03.exam01_parent_constructor_call;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo){
    super(name, ssn);   //생성자 첫 번째 줄
    this.studentNo = studentNo;
        System.out.println("자식 객체 생성 완료");
    }

}
