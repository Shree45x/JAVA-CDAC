package day5;

public class SavingAccount extends Account {
    private final String type = "SAVINGACC";
    private float interestRate;

    public SavingAccount(int accountId , int balance , int interestRate){
        super(accountId , balance);
        this.interestRate = interestRate;
    }

    public String toString(){
        return super.toString() + "";
    }
}
