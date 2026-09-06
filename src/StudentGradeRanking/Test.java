package StudentGradeRanking;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentOperation S = new StudentOperation();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Grade & Ranking System ---");
            System.out.println("1. Add Students");
            System.out.println("2. View Class Rankings & Grades");
            System.out.println("3. Lookup Student by Rank");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    S.addstuednt();
                    break;
                case 2:
                    S.diplaymark();
                    break;
                case 3:
                    S.lookupByRank();
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
        scanner.close();
    }
}
