package chap10.sec02_runtime_exception;
/**chap10 10.2.2 ArrayIndexOutOfBoundsException **/
/* 배열에서 인덱스 범위를 초과하여 사용할 경우 발생 */
public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];

      // System.out.println("args[0]: " + data1 );
      // System.out.println("args[1]: " + data2 );
    }

}

/*                  console
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at chap10.sec02_runtime_exception.ArrayIndexOutOfBoundsExceptionExample.main(ArrayIndexOutOfBoundsExceptionExample.java:7)
*/