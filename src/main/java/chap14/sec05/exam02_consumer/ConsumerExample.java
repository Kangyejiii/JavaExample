package chap14.sec05.exam02_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t+"8");
        consumer.accept("java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t+u);
        biConsumer.accept("야","호"); //t는 야 u는 호 두개의 매개값을 받아 소비(리턴값이 없음)

        DoubleConsumer doubleConsumer = d -> System.out.println(d+3);
        doubleConsumer.accept(5.0);   //8.0

        ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t+i);
        objIntConsumer.accept("java", 888);
    }

}
