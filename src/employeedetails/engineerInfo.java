package employeedetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class engineerInfo {
    public void Engineer(){
        List<Employee> staffList = new ArrayList<>();
        Scanner N=new Scanner(System.in);
    System.out.println("Engineer Name : ");
    String name = N.nextLine();

    System.out.println("Engineer Department : ");
    String department = N.nextLine();

    System.out.println("Engineer ID :");
    String id = N.nextLine();

    System.out.println("Engineer Incentive");
    int incentive = N.nextInt();
    N.nextLine(); // <-- ADD THIS LINE to consume the leftover newline
        staffList.add(new Engineer(name, department, id, incentive));
}
    }

