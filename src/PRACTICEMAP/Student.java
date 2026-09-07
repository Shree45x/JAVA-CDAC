package PRACTICEMAP;

public class Student {


    protected int rollNo;
    protected String name;
    protected double cgpa;

    public Student(int rollNo,String name,double cgpa){
        this.cgpa=cgpa;
        this.rollNo=rollNo;
        this.cgpa=cgpa;
    }


    public Student(){

    }

    public double getCgpa() {
        return cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
