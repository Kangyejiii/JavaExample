package chap13.sec02.exam02_generic_type;
/**< > 안에 구체적인 타입값 지정해야한다.*/
public class BoxExample {

    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.setT("hello");
        System.out.println(box.getT());

        Box<Integer> box1 = new Box<>();
        box1.setT(100);
        int num = box1.getT();
        System.out.println(num);
    }

}
