package day2;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getEmployeeId() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

