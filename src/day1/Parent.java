package day1;

public class Parent {

    public int pubInt ;
    protected int proInt;
    private int priInt;
    int defInt;

    public void doSomething(){
        System.out.println(pubInt);
        System.out.println(proInt);
        System.out.println(priInt);
        System.out.println(defInt);
    }
}
