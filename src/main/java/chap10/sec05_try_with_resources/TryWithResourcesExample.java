package chap10.sec05_try_with_resources;
/**chap10 10-5 자동 리소스 닫기 try-with-resources**/
/*
  * try-with-resources
  : 예외 발생 여부와 상관없이 사용했던 리소스 객체(각종 입출력스트림, 서버소켓, 소켓, 각종 채널)의 close()메소드를 호출해서 안전하게 리소스를 닫아준다.
  * 리소스 객체의 조건
  : java.lang.AutoCloseable 인터페이스를 구현하고 있어야 한다.
* */
public class TryWithResourcesExample {

    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("file.txt")){
            fis.read();
            throw new Exception();      //강제적으로 예외 발생시킴
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }

}
