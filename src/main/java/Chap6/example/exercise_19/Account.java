package Chap6.example.exercise_19;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;


    public void setBalance(int balance) {
      /*  if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
            this.balance = balance;
        } else {
            return;
        }*/
        //상수는 언제나 클래스로 접근..?!
        if (balance < Account.MIN_BALANCE ||
                balance > Account.MAX_BALANCE) {
            return;
        } else {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}
