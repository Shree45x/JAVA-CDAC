package FlightBooking;

public class SeatAlreadyBookedException extends RuntimeException{

    SeatAlreadyBookedException(String message){
        super(message);

    }
}
