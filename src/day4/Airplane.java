package day4;

public class Airplane implements IFly {
    @Override
    public void fly(){
        System.out.println("Airplane flies");
    }

    public void thrust(){
        System.out.println("Airplane thrust");
    }

    public boolean land() {
        return true;
    }
}
