package employeedetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Employee {
    String project;

    public Manager(String name , String department,String Id,String project){
        super(name,department,Id);
        this.project = project;
    }

    public Manager(){

    }
    List<Employee> staffList = new ArrayList<>();
    void Manager(List<Employee> staffList) {
        Scanner N=new Scanner(System.in);
        System.out.println("Manager Name : ");
        String nameM = N.nextLine();

        System.out.println("Manager Department : ");
        String departmentM = N.nextLine();

        System.out.println("Manager ID :");
        String idM = N.nextLine();

        System.out.println("Manager Incentive");
        String projectM = N.nextLine();
        staffList.add(new Manager(nameM, departmentM, idM, projectM));
        }


      void ALLMAnagerList(List<Employee> staffList){
        for(Employee emp:staffList){
            if(emp instanceof Manager){
                System.out.println(emp);
            }
        }
      }
    @Override
    public String toString(){
        return "Manager [Manager Id : "+Id + " \n name :" + name + " \n project : " + project + "]";
    }
}
