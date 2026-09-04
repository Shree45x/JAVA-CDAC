package day5;

public class CurrentAccount {
    private float overdraft;

    public CurrentAccount(int overdraft){
    this.overdraft = overdraft;
    }

    public String toString(){
        return super.toString() + "CurrentAccount[" + "overdraft:" + overdraft + "]";
    }
}
