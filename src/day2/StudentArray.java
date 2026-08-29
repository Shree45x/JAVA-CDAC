package day2;

import java.util.Scanner;

public class StudentArray {
    private Student[] students = new Student[10];
    private Scanner sc = new Scanner(System.in);

    void populateEmployee(){
        int i = 0;
        while(i<students.length){
            System.out.print("Enter id and name of the Employee : ");
            int val = sc.nextInt();
            String val2 = sc.next();
            Student currStu = new Student(val,val2);
            students[i++] = currStu;
        }
    }

    void displayEmployee(){
        for(Student stu : students){
            System.out.println(stu.rollNo + stu.name);
        }
    }
}
