package FlightBooking;

import java.util.Scanner;

public class FlightBookingManager {

    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        boolean running = true;

        SeatBookingOperation S = new SeatBookingOperation();
        while (running) {
            System.out.println("\n--- Flight Booking & Boarding System ---");
            System.out.println("1. Book Seat");
            System.out.println("2. Cancel Booking");
            System.out.println("3. View Boarding Order (Sorted Statistics)");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int n = N.nextInt();

            switch (n) {
                case 1:
                    S.seatbooking();
                    break;
                case 2:
                    //S.cancelseat(); // Fixed to trigger cancellation method
                    break;
                case 3:
                    S.displayAllbokingseat();
                    break;
                case 4:
                    System.out.println("Thank u for Visiting");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice......");
            }
        }
    }
}