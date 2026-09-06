package EmployeePayroll;

public class Employee {

    protected int empId;
    protected double salary;

    public Employee(int empId,double salary){
        this.empId=empId;
        this.salary=salary;
    }

    public  Employee(){

    }


    public double getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }
}
