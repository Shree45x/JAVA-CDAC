package day2;

public class Employee {
    int id;
    String name;

    public Employee(int id , String name){
        this.id = id;
        this.name = name;
    }

    public int getEmployeeId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(Employee e , String newName){
        e.name = newName;
    }

    @Override
    public String toString(){
        return this.getEmployeeId() + " " + this.getName();
    }
}
