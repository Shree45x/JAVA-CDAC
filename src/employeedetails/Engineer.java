package employeedetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engineer extends Employee {
    float incentive;

    public Engineer(String name , String department,String Id ,float incentive){
        super(name ,department,Id);
        this.incentive = incentive;
    }

    public Engineer() {

    }
    List<Employee> staffList = new ArrayList<>();
    public void Engineer(List<Employee> staffList){
        Scanner N=new Scanner(System.in);
        System.out.println("Engineer Name : ");
        String name = N.nextLine();

        System.out.println("Engineer Department : ");
        String department = N.nextLine();

        System.out.println("Engineer ID :");
        String id = N.nextLine();

        System.out.println("Engineer Incentive");
        int incentive = N.nextInt();
        N.nextLine(); // <-- ADD THIS LINE to consume the leftover newline
        staffList.add(new Engineer(name, department, id, incentive));
    }

    public  void DisplayAllEngineerList(List<Employee> staffList){
        for(Employee emp:staffList){
            if (emp instanceof Engineer){
            System.out.println(emp);
        }}
    }

    // In Engineer.java (Update toString method)
    @Override
    public String toString(){
        return "Engineer [Engineer ID : "+Id +
                " \n name : " + name +
                " \n department : " + department +
                " \n incentive : " + incentive + "]";
    }
}
