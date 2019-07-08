package chap10.sec03_try_catch_finally;
/**chap10 10.3 실행 예외 처리 **/
public class TryCatchFinallyRuntimeExceptionExample {

    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }


        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다");
        } finally {
            System.out.println("다시실행하세요");
        }


    }

}
