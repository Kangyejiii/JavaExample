package chap10.sec07_user_define_exception;
/**chap10 사용자 정의 예외 클래스 선언방법*/

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException(){} //기본생성자
    public BalanceInsufficientException(String message){
        super(message);
    }
}

/*
10-7 사용자 정의 예외와 예외 발생
사용자 정의 예외 클래스 선언
 > 자바 표준 API에서 제공하지 않는 예외
 > 애플리케이션 서비스와 관련된 예외
  ex) 잔고 부족 예외, 계좌 이체 실패 예외, 회원가입 실패 예외..
*/