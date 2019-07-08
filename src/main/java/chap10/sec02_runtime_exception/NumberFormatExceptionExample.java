package chap10.sec02_runtime_exception;
/** chap10 10.2.3 실행예외- NumberFormatException**/
/*
* NumberFormatException
 >문자열을 숫자로 변환하는 경우가 많다.
  ex) Integer.parseInt(String s) : 주어진 문자열을 정수로 변환해서 리턴
      Double.parseDouble(String s)
 >숫자로 변환 될 수 없는 문자가 포함되어 있을 경우 발생
*/
public class NumberFormatExceptionExample {

    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        // int value2 = Integer.parseInt(data2);
    }

}

/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at chap10.sec02_runtime_exception.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:17)*/