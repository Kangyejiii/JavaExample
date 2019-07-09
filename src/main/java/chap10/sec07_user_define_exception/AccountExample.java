package chap10.sec07_user_define_exception;
/**chap10 10-8 예외 정보 얻기*/
/* getMessage()
   > 예외를 발생시킬 때 생정자 매개값으로 사용한 메시지를 리턴
     throw new XXXException("예외 메시지");
   > 좀 더 상세 원인을 세분화하기 위해 예외 코드를 포함(예: 데이터베이스 예외 코드)
   > catch()절에서 활용
     String message = e.getMessage();

  printStackTrace()
   > 예외 발생 코드를 추적한 내용을 모두 콘솔에 출력한다.
   > 프로그램을 테스트하면서 오류를 찾을 때 활용된다.
*/
public class AccountExample {

    public static void main(String[] args) {
        Account account = new Account();
        //예금
        account.deposit(10000);
        System.out.println("예금액 " + account.getBalance());
        //출금
        try {
            account.withdraw(30000);
            System.out.println("예금액: " + account.getBalance());
        } catch (BalanceInsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
            //e.printStackTrace();               //개발할 때 사용
            System.out.println(e.toString());   //간단하게 예외 정보 얻기
        }
    }

}
