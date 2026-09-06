package FlightBooking;

import FlightBooking.Passanger;
import FlightBooking.SeatAlreadyBookedException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeatBookingOperation {

    static Scanner input = new Scanner(System.in);
    static  Map<Integer, String> map= new HashMap<>();
    public void seatbooking() {
        Passanger P = new Passanger();



        System.out.println("Select seat number:  \n1. 102 \n2. 101 \n3. 103 \n4. 104 \n5. 105 \n6. 106 \n7. 107 \n8. 108");
        int n = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        int seatNumber = 0;
        switch (n) {
            case 1: seatNumber = 102; break;
            case 2: seatNumber = 101; break;
            case 3: seatNumber = 103; break;
            case 4: seatNumber = 104; break;
            case 5: seatNumber = 105; break;
            case 6: seatNumber = 106; break;
            case 7: seatNumber = 107; break;
            case 8: seatNumber = 108; break;
            default:
                System.out.println("Invalid seat selection.");
                return;
        }

        try {
            if (map.containsKey(seatNumber)) {
                throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already occupied!");
            }

            System.out.println("Enter Your Passport number:");
            String passportNo = input.nextLine();
            map.put(seatNumber, passportNo);
            System.out.println("Hey Your seat is booked...");

        } catch (SeatAlreadyBookedException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
    }

    public void cancelBooking() {
        System.out.println("Enter seat number to cancel:");
        int seatNumber = input.nextInt();
        input.nextLine();

        try {
            if (!map.containsKey(seatNumber)) {
                throw new PassengerNotFoundException("No active booking found for seat number " + seatNumber + ".");
            }

            map.remove(seatNumber);
            System.out.println("Success: Booking for seat " + seatNumber + " has been cancelled.");

        } catch (PassengerNotFoundException e) {
            System.out.println("Cancellation Failed: " + e.getMessage());
        }
    }

    public void displayAllbokingseat() {
        if (map.isEmpty()) {
            System.out.println("No seats have been booked yet.");
            return;
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Seat-Number : " + entry.getKey() + " Passport Number: " + entry.getValue());
        }
    }
}