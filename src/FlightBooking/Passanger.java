package FlightBooking;

public class Passanger {

    protected String passportNumber;
    protected int seatNumber;


    public Passanger(String passportNumber,int seatNumber){
        this.passportNumber=passportNumber;
        this.seatNumber=seatNumber;
    }

    public Passanger(){

    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public int getSeatNumber(){
        return seatNumber;
    }
}
