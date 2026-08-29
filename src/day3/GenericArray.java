package day3;

import day2.Employee;

import java.util.Arrays;

public class GenericArray {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        Employee emp = new Employee(1,"Aaryan");
        Employee emp1 = new Employee(2,"Sarthak");

        objects[0] = emp;
        objects[1] = "Aaryan";
        objects[2] = emp1;

        for(Object obj : objects) System.out.println(obj);
        System.out.println(Arrays.toString(objects));
    }
}
