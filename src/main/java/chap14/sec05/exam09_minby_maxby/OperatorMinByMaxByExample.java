package chap14.sec05.exam09_minby_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

    public static void main(String[] args) {
        BinaryOperator<Fruit> binaryOperator;
        Fruit fruit;

        binaryOperator = BinaryOperator.maxBy( (a,b)-> Integer.compare(a.price,b.price) );
        fruit = binaryOperator.apply(
                new Fruit("딸기",5000),
                new Fruit("수박",10000)
                );
        System.out.println(fruit.name);



        binaryOperator = BinaryOperator.minBy((a,b)->Integer.compare(a.price, b.price) );
        fruit = binaryOperator.apply(
                new Fruit("딸기",5000),
                new Fruit("수박",10000)
        );
        System.out.println(fruit.name);


    }
}

class Fruit {
    public String name;
    public int price;

    Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
