package EmployeePayroll;

import java.util.Scanner;

public class HrUserHIREInterface {

    public static void main(String[] args) {
        Scanner N=new Scanner(System.in);
        boolean ruuning=true;
        EmployeeHiring E=new EmployeeHiring();

        while (ruuning){
            System.out.println("HR_____Dashboard________");
            System.out.println("1.Hire Employee:\n2.Fire Employee\n3.Display ID AND SALARY:\n4.Total Payroll \n5.Highest Salary :\n6.exist");
            int NUM=N.nextInt();

            switch (NUM){
                case 1:
                    E.hireEmp();
                    break;
                case 2:
                    E.FireEmp();
                    break;
                case 3:
                    E.DisplayEmpsalary();
                    break;
                case 4:
                    E.totalpayroll();
                    break;
                case 5:
                    System.out.println("Highest salary :");
                    E.highestSalary();
                    break;
                case 6:
                    System.out.println("THANK UUUU");
                    ruuning=false;
                    break;

                default:
                    System.out.println("Invalid choice:");
            }
        }



    }
}
