package day3;

public class TestInheritance {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(10);
        Vehicle v2 = new Vehicle(52 , "McLaren");

        System.out.println(v1.speed);

        v1.honk();
        v1.doNothing();
        v2.doNothing();

        Vehicle v3 = new Car();
//        Car c1 = (Car) v3; //unstable

        if(v3 instanceof Car){
            Car c1 = (Car) v3; //stable
            c1.engine();
        }
    }
}
