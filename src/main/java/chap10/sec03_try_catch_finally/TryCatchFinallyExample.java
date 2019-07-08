package chap10.sec03_try_catch_finally;
/** chap10 10.3예외처리-일반 예외 처리 **/
//Class.forName() : 매개값으로 주어진 클래스가 존재하면 Class 객체 리턴.
//                  존재하지않으면 ClassNotFoundException 예외발생
//                  일반예외이므로 컴파일러는 개발자로 하여금 예외 처리 코드 작성요구

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
            e.printStackTrace();
            //리턴값없음. 이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력 : 가장 자세한 예외정보를 제공
        }
    }

}
