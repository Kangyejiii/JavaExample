package chap13.sec06.exam01_generic_wildcard;

public class Course <T> {
    private String name;
    private  T[] students;  //일반,근로자,학생

    public Course(String name, int capacity){
        this.name = name;
        //students = new T[capacity];
        students = (T[])(new Object[capacity]); //최대 학생수 지정
    }

    public String getName(){return name;}
    public T[] getStudents() {return  students;}

    public void add(T t){
        //배열에 비어있는 공간을찾아서 저장하도록

        for (int i = 0; i < students.length ; i++) {
            if(students[i]==null) {
                students[i] = t;
                break;
            }
        }
    }
}
