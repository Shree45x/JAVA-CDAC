package day4;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int x = 2 / 0;
                    System.out.println("1st inner try");
                }finally{
                    System.out.println("1st inner final");
                }

            }
            catch(ArithmeticException e){
                System.out.println("bahar wali catch");

            }finally{
                System.out.println("2nd inner final");
            }

        }

        catch(Exception e){
            System.out.println("outer catch");
        }

        finally{
            System.out.println("outer final");
        }
    }
}
