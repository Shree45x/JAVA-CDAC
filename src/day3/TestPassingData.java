package day3;

import day2.Employee;

import java.util.Arrays;

public class TestPassingData {
    void tryToChange(int x){
        x=99;
    }

    void updateItem(Employee e){
        Employee e1 = e;
        e1.setName(e,"xyz");
        System.out.println(e1);
    }

    void updateArray(String[] strArr){
        strArr[1] = "superman";
        System.out.println(Arrays.toString(strArr));
    }

    public static void main(String[] args) {
        int x = 5;
        TestPassingData test = new TestPassingData();
        test.tryToChange(x);
        System.out.println(x + "");

        Employee e2 = new Employee(3,"pokemon");
        test.updateItem(e2);
        System.out.println(e2.getName());

        String[] arr = new String[2];
        arr[0] = "A";
        arr[1] = "B";
        test.updateArray(arr);
    }
}


