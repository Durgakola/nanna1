package bookmyshow1;

public class ExceptionTest {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService("1234","1234",10,3000);
        try {
            paymentService.login("1234", "1234");
            paymentService.bookingTicket();
            paymentService.payment();
        }catch (InvalidInputException e){
            System.out.println(e.getCode() + " : "+e.getMessage());
        }catch (InvalidCredintialsException e){
            System.out.println(e.getCode() + " : "+e.getMessage());
        }catch (InsufficientbalanceException e){
            System.out.println(e.getCode() + " : "+e.getMessage());
        }
    }
}
