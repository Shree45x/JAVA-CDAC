package day3;

public class Vehicle {
    protected int speed;
    protected int fine;
    final protected int numberOfTyres = 4;
    private int id;
    protected String name;

    Vehicle(int speed){
        id = 10;
        this.speed = speed;
    }

    Vehicle(int speed , String name){
        id = 10;
        this.speed = speed;
        this.name = name;

    }

    public void honk(){
        System.out.println("BEEP");
    }

    public void doNothing(){
        System.out.println("Nothing Vehicle");
    }
}
