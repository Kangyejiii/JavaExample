package chap13.sec06.exam01_generic_wildcard;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){return  name;}

    @Override
    public String toString(){
        return  name;
    }
}
