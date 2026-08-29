package day4;

public class TestInterface {
    public static void main(String[] args) {
        IFly ifly = new Superman();
        ifly.fly();

        if(ifly instanceof Superman){
            Superman sm = (Superman) ifly;
            sm.power();
        }
        else System.out.println("Batman");

        IFly ifly1 = new Airplane();
        ifly1.fly();

        if(ifly1 instanceof Airplane){
            Airplane sm = (Airplane) ifly1;
            sm.thrust();
        }
        else System.out.println("Batman");


        IFly ifly2= new Bird();
        ifly2.fly();

        if (ifly2 instanceof Bird){
            Bird b1=new Bird();
            b1.sound();}
        else System.out.println("Batman");

        ISwim ifly3 = new Temp();
        ifly3.swim(2,3);
        ifly3.swim();
    }
}
