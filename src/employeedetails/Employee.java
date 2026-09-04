package employeedetails;

import java.util.*;

public class Employee {
    protected String name;
    protected String department;
    protected String  Id;
    protected  static Map<String , ArrayList<String>> map = new HashMap<>();

    public Employee(String name , String department,String Id){
        this.name = name;
        this.department = department;
        this.Id=Id;
    }


    public Employee(){
        this.name = "Random";
        this.department = "N/A";
        this.Id=" ";
    }

    @Override
    public String toString(){
        return "Employee [Employee Id:" + Id + " \n name :" + name + " \n department : " + department + "]";
    }

    public boolean addToEmpMap(String name , String department) {
        if (map.isEmpty() || !map.containsKey(department)) {
            map.put(department , new ArrayList<String>());
        }

        ArrayList<String> tmp = map.get(department);
        tmp.add(name);
        tmp.add(Id);
        return true;
    }



}
