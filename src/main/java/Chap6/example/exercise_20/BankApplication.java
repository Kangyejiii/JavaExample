package Chap6.example.exercise_20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0 ;

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
            System.out.println("----------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;

            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기 입금액: ");
        int balance = scanner.nextInt();
//        accountArray[count] = new Account(ano, owner, balance);
//        count++;

        Account newAccount = new Account(ano, owner, balance);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과 계좌가 생성되었습니다.");
                break;
            }
        }
    }


    private static void accountList() {
        System.out.println("------------");
        System.out.println("계좌목록");
        System.out.println("------------");

        for (int i = 0; i < accountArray.length; i++) {
          Account account = accountArray[i];
          if(account != null){
              System.out.print(account.getAno());
              System.out.print("    ");
              System.out.print(account.getOwner());
              System.out.print("    ");
              System.out.print(account.getBalance());
              System.out.println();
          }

        }

        int i = 0;
//        while(accountArray[i]!=null) {
//            System.out.println(accountArray[i].getAno() + "  " +
//                    accountArray[i].getOwner() + "  "
//                    + accountArray[i].getBalance());
//            i++;
//        }


    }

    private static void deposit() {
        System.out.println("------------");
        System.out.println("예금");
        System.out.println("------------");

        System.out.print("계좌번호 ");
        String ano = scanner.next();
        System.out.print("예금액 ");
        int balance = scanner.nextInt();

        Account result =  findAccount(ano);

        if(result == null) {
            System.err.println("땡");
            return;
        }

        result.setBalance(result.getBalance() + balance);
        System.out.println("결과 : 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        System.out.println("------------");
        System.out.println("출금");
        System.out.println("------------");
        System.out.print("계좌번호 ");
        String ano = scanner.next();
        System.out.print("출금액 ");
        int balance = scanner.nextInt();

        Account result =  findAccount(ano);

        if(result == null) {
            System.err.println("계좌정보를 찾을 수 없습니다");
            return;
        }

        int result_balance =result.getBalance() - balance;

        if(result_balance < 0) {
            System.err.println("잔액이 부족합니다");
            return;
        } else {
            result.setBalance(result_balance);
            System.out.println("결과 : 출금이 성공되었습니다.");
        }

    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] != null){
                String dbAno = accountArray[i].getAno();
                if(dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;


//        int i = 0;
//        while (accountArray[i] != null) {
//            if (accountArray[i].getAno().equals(ano)) {
//
//                return accountArray[i];
//            } else {
//                i++;
//            }
//
//        }

//        return null;
    }
}