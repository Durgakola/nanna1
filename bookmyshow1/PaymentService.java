package bookmyshow1;

public class PaymentService extends BookTickets {
    private int ticketPrice = 200;
    private int totalTicketPrice;
    private int balance;
    boolean bookingTickets;

    public PaymentService(String validUserName, String valiPassword, int noOfSeats, int balance) {
        super(validUserName, valiPassword, noOfSeats);
        this.balance = balance;
    }

    public boolean payment() throws InsufficientbalanceException {
        totalTicketPrice = noOfSeats * ticketPrice;
        if (noOfSeats <= totalNoOfSeats) {
            if (totalTicketPrice <= balance) {
                System.out.println("Payment is successful");
                int remainingBalance = balance - totalTicketPrice;
                System.out.println("Remaining Balance After Payment: " + remainingBalance);
            } else {
                throw new InsufficientbalanceException(Errorcodes.Insufficient_Balance.getCode(),
                        Errorcodes.Insufficient_Balance.getMessage());
            }
        }
        return false;
    }
}


