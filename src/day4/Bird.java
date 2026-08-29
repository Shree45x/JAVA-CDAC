package day4;

public class Bird implements IFly {
    @Override
    public void fly() {
        System.out.println("Bird is flying.......");
    }
    public void sound(){
        System.out.println("HHIIIIIII");
    }

    public boolean land() {
        return true;
    }
}
