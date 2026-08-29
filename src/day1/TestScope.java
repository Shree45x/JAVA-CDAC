package day1;

import java.sql.SQLOutput;

public class TestScope {
    static int i_global = 10;
    int i_ns_global = 30;
    public static void main(String[] args){
        int i_main = 20;
        System.out.println(i_main);
        System.out.println(i_global);
        //Here non static wont work until we make an object
        //System.out.println(i_ns_global);

        //Creating object of class
        TestScope testScope = new TestScope() ;
        System.out.println(testScope.i_ns_global);
        testScope.DoSomething();
    }

    public void DoSomething(){
        System.out.println(i_global);
        System.out.println(i_ns_global);
        //Here variables of main function wont work as they are out of scope
        //System.out.println(i_main);
    }
}
