package employeedetails;

import java.util.*;

public class TestEmp {
    public static void main(String[] args) {
        List<Employee> staffList = new ArrayList<>();
        Scanner N=new Scanner(System.in);

        Engineer E=new Engineer();
        Manager M=new Manager();

        int i=0;
        while(i<=1){
            System.out.printf("What u want to add : \n 1.Engineer \n 2. Manager \n 3. Employee \n 4.Diaplay-All-EngineerList \n 5.Display ALL-MAnager-List \n 6.Exist");
            int num= N.nextInt();
            N.nextLine();
         switch (num) {
             case 1:
                 E.Engineer(staffList);
                 break;
            case 2:
                 M.Manager(staffList);

            case 3:
                staffList.add(new Employee("Charlie", "103", "HR"));
                break;

             case 4:
                 E.DisplayAllEngineerList(staffList);
                 break;

             case 5:
                 M.ALLMAnagerList(staffList);
                 break;

            case 6:
                System.out.println("Exist");
                i=2;
                break;
             default :
                 System.out.println("Thank  UUUUUU");


        }



        }


//        staffList.add(new Engineer("Alice", "Software","101" ,5000));
//        staffList.add(new Manager("Bob", "Operations", "102","Cloud Migration"));
//        staffList.add(new Employee("Charlie","103" ,"HR"));

        // Iterating and demonstrating polymorphic toString() behavior
        for (Employee emp : staffList) {
            System.out.println(emp.toString());
        }
    }
}
