package chap10.sec04_multi_catch;
/** chap10 10.4.3 예외 종류에 따른 처리 코드- 멀티 catch **/

public class MultiCatchExample {

    public static void main(String[] args) {

       try {
           String data1 = args[0]; //ArrayIndexOutOfBoundException 발생
           String data2 = args[1];
           int value1 = Integer.parseInt(data1);    //NumberFormatException 발생
           int value2 = Integer.parseInt(data2);
           int result = value1 + value2;
           System.out.println(data1 + "+" + data2 + "=" + result);

       } catch(ArrayIndexOutOfBoundsException |NumberFormatException e) {
          /**하나의 catch 블록에서 여러 개의 예외를 처리할 수 있다.**/
           System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환 할 수 없음");
       } catch (Exception e) {
           System.out.println("알수 없는 예외 발생");
       } finally {
           System.out.println("다시 실행하세요!");
       }

    }

}
