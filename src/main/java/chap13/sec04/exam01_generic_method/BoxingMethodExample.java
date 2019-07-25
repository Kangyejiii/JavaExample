package chap13.sec04.exam01_generic_method;
/**메소드 앞에 <  > 제네릭 구체적인타입명시해준다!*/
public class BoxingMethodExample {

    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        int intValue = box1.getT();

        System.out.println(intValue);

        Box<String> box2 = Util.boxing("홍길동");
        //구체적으로 명시하지않으면 유추한다.
        //Box<String> box2 = Util.<String>boxing("홍길동");
        //원래 T타입이 와야하는데 String이 왔으니 이제 String으로 변환!
        System.out.println(box2.getT());
    }

}
