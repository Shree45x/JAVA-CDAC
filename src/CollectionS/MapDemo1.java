package CollectionS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> studentMap = new HashMap<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student List");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Mark: ");
                    double mark = scanner.nextDouble();
                    scanner.nextLine();

                    studentMap.put(id, "[Name=" + name + ", Mark=" + mark + "]");
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\nResulting Map:");
                    if (studentMap.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}