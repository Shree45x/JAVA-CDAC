package day3;

public class Car extends Vehicle {
    String name;

    Car(int speed , String name){
        super(speed);
        this.name = name;
    }

    Car(int speed){
        super(speed);
    }

    Car(){
        this(0, "Unknown");
    }

    public void doNothing(){
        System.out.println("Nothing Car");
    }

    public void honk(){
        System.out.println("POMPOM");
    }

    public void engine(){
        System.out.println("Car Engine");
    }
}
