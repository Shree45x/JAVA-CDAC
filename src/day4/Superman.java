package day4;

public class Superman implements IFly {
    @Override
    public void fly(){
        System.out.println("Superman flies");
        System.out.println(speed);
    }

    public void power(){
        System.out.println("1000W");
    }

    public boolean land(){
        return false;
    }
}
