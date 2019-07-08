package chap10.sec02_runtime_exception;
/**10장 실행예외 NullPointerExceptionExample**/
/*객체 참조가 없는 상태,
  즉 null 값을 갖는 참조변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
       String data = null;
      // System.out.println(data.toString());
    }

}

/*Exception in thread "main" java.lang.NullPointerException
	at chap10.sec02_runtime_exception.NullPointerExceptionExample.main(NullPointerExceptionExample.java:9)*/
