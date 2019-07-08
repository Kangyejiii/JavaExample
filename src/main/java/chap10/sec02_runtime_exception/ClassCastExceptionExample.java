package chap10.sec02_runtime_exception;
/**chap10 10.2.4 실행예외-ClassCastExceptionExample**/
/*instanceof 연산자*/

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal) {
        if(animal instanceof Dog) {
        Dog dog = (Dog) animal;
        } else {
            System.out.println("Dog 변환 X");
        }
    }

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
