package Chap6.sec11.exam01_final;

// TODO: 2019-04-16 final field

public class Person {
    final String nation="Korea";
    final String ssn;
    String name;

    Person(final String ssn, final String name){
        this.ssn=ssn;
        this.name=name;
       // nation = "Ameriaca"; -> 할 수 없다.

    }


}
