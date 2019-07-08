package chap10.sec06_throws;
/**chap10 10-6 예외 떠넘기기 **/
/*throws
> 메소드 선언부 끝에 작성
> 메소드에서 처리하지 않은 예외를 호출한 곳으로 떠 넘기는 역할
> throws 키워드가 붙어있는 메소드는 반드시 try 블록 내에서 호출되어야 한다.
*/
public class ThrowsExample {

    public static void main(String[] args) {

        try {
            findClass();    //호출하는 곳에서는 예외처리를 꼭해야함
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }

}
