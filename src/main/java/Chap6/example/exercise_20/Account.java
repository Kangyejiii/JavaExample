package Chap6.example.exercise_20;

public class Account {
    private String ano;
    private String owner;
    private int balance;

    public Account(final String  ano, final String owner, final int balance){
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(final String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(final int balance) {
        this.balance = balance;    }
}
