package EmployeePayroll;

import java.security.KeyStore;
import java.util.*;

public class EmployeeHiring {

    Employee e=new Employee();
    static List<Employee> list=new ArrayList<>();
    static Map<Integer,Double> map=new HashMap<>();
    static Scanner input=new Scanner(System.in);
//Provide an HR user the ability to hire employees into the system, each with a unique employee ID and a salary.
    public void hireEmp(){

        System.out.println("How Many Employee u want to hire :");
        int num=input.nextInt();

        for (int i=0;i<num;i++) {
            try {
                System.out.println("Enter " + (i + 1) + " Employee id:");
                int id = input.nextInt();
                if (map.containsKey(id)) {
                    throw new DuplicateEmployeeException("duplicate id found..Plz enter Unique ID");
                }

                System.out.println("Enter" + (i + 1) + " Employee Salary:");
                double salary = input.nextDouble();

                map.put(id, salary);
            }catch (DuplicateEmployeeException e){
                System.out.println(e.getMessage());
                i--;
            }
        }

    }
    public void DisplayEmpsalary(){
        for (Map.Entry<Integer,Double> entry: map.entrySet()){
            System.out.println("Employee : " +entry.getKey() + "->>>>> Salary : " +entry.getValue());
        }
    }

    public  void FireEmp(){
        System.out.println("Enter Employee id:");
        int id = input.nextInt();
        try{
            if (!map.containsKey(id)){
                throw new EmployeeNotFoundException("invalid id OR Employee not found");

            }
        } catch (EmployeeNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        map.remove(id);
        System.out.println("Employee id: " +id+ " Removed.......");
        }

    public void totalpayroll(){
        double totalpayroll=0.0;

        for (double salary:map.values()){
            totalpayroll+=salary;
        }
        System.out.println("Total payroll cost:"+totalpayroll);
    }


    public void highestSalary(){
        int n=1;
        map.entrySet().stream().sorted(Map.Entry.<Integer,Double>comparingByValue().reversed()).limit(n).
                forEach(entry -> System.out.println("ID :"+entry.getKey() +" | Salary :"+entry.getValue()));
    }


}
