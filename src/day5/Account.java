package day5;

public class Account {
    protected int accountId;
    protected int balance;
    private String type;

    public Account(int accountId , int balance){
        this.accountId = accountId;
        this.balance = balance;
        this.type = type;
    }

    public int getAccount(){
        return accountId;
    }

    public int getBalance(){
        return balance;
    }

    public int setBalance(int balance){
        return this.balance = balance;
    }

    public String toString(){
        return super.toString() + "";
    }
}
