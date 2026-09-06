package StudentGradeRanking;

public class Student {
    protected int rollNo;
    protected float cgpa;



    public Student(int rollNo,float cgpa){
        this.rollNo=rollNo;
        this.cgpa=cgpa;
    }

    public  int getRollNo(){
        return rollNo;
    }

    public float getCgpa() {
        return cgpa;
    }

}
