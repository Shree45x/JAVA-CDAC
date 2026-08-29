package day1;

public class TestConstructor{

    int i = 10;

    //Constructor Overloading

    TestConstructor(){
        System.out.println("Default");
        i = 10;
    }

    TestConstructor(int i){
        System.out.println("Param Constructor");
        this.i = i;
    }

    public static void  main(String[] args){
        TestConstructor tc = new TestConstructor();
        System.out.println(tc.i);
        TestConstructor tc1 = new TestConstructor(6);
        System.out.println(tc1.i);
    }
}
