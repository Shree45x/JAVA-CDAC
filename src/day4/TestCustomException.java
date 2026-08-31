package day4;

public class TestCustomException {

    public static void main(String[] args) {

//        TestCustomException T= new TestCustomException();
//        T.doSomething();

        new TestCustomException().doSomething();
        }

    void doSomething(){
        String s =new String("CDAC");
        if(!s.equals("Shree")){
            throw  new CustomException("String not equal");
        }
    }
}
