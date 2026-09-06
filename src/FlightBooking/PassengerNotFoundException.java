package FlightBooking;

public class PassengerNotFoundException extends RuntimeException {

    PassengerNotFoundException(String message){
        super(message);
    }
}
