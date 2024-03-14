package bookmyshow1;

public class BookTickets extends Login{
    public int noOfSeats;
    public int totalNoOfSeats=10;
    boolean loginStatus;

    public BookTickets(String validUserName, String valiPassword,int noOfSeats) {
        super(validUserName, valiPassword);
        this.noOfSeats=noOfSeats;
    }
    public boolean bookingTicket() throws InvalidInputException{
        if(noOfSeats<=totalNoOfSeats){
            int availebleSeats=totalNoOfSeats-noOfSeats;
            System.out.println("Booking Seats: "+noOfSeats);
            System.out.println("Remaining seats: "+availebleSeats);
        }
        else{
            System.out.println("Requested Seats: "+noOfSeats);
            System.out.println("Available Seats: "+totalNoOfSeats);
            throw new InvalidInputException(Errorcodes.Invalid_Input.getCode(),
                    Errorcodes.Invalid_Input.getMessage());
        }
        return false;

    }
}
