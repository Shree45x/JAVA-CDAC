package PRACTICEMAP;

import java.util.HashMap;
import java.util.Map;

public class StudentOperation {

    public void addstudent(){
        Map<Integer,Student> map= new HashMap<>();
        Student S=new Student();
        map.put(1,new Student(221708,"Shreejeet Gaikwad",9.2));


        for (Map.Entry<Integer,Student> entry: map.entrySet() ){
            System.out.println("-->>"+entry.getValue());

        }

    }
}


