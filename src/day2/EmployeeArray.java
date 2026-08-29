package day2;

import java.util.Scanner;

public class EmployeeArray {
    private Employee[] employees = new Employee[1];
    private Scanner sc = new Scanner(System.in);

    void populateEmployee(){
        int i = 0;
        while(i<employees.length){
            System.out.print("Enter id and name of the Employee : ");
            int val = sc.nextInt();
            String val2 = sc.next();
            Employee currEmp = new Employee(val,val2);
            employees[i++] = currEmp;
        }
    }

    void displayEmployee(){
        for(Employee emp : employees){
            //System.out.println(emp.id + emp.name);
            System.out.println(emp.toString());
        }

    }


}
