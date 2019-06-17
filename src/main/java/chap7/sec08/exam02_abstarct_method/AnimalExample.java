package chap7.sec08.exam02_abstarct_method;

import chap7.sec04.exam01_overriding.Calculator;

public class AnimalExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sounds();
        cat.sounds();
        System.out.println("---------------");

        Animal animal = null;
        animal = new Dog();
        animal.sounds();

        animal = new Cat();
        animal.sounds();

        animalSound(new Dog());
        animalSound(cat);

    }


    public static void animalSound(Animal animal){
        animal.sounds();
    }


}
