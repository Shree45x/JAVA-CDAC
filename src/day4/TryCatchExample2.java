package day4;

import java.util.Scanner;

public class TryCatchExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter numerator : ");
            int numerator = sc.nextInt();
            System.out.print("Enter denominator : ");
            int denominator = sc.nextInt();
            System.out.println(numerator / denominator);
        }catch(ArithmeticException ae){
            System.out.print("You are dividing by ZERO : ");
            System.out.print("Exception thrown : " + ae.getMessage());
        }finally{
            System.out.print("Closing Scanner connection");
            sc.close();
        }
    }
}
