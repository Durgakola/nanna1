package Bank;

public class CardProcessTest {
    public static void main(String[] args) {
        CardProcessingService processingService=new CardProcessingService();

        CardDetails cardDetails=new CardDetails();
        System.out.println(cardDetails.hashCode());
        cardDetails.cardNumber="123456";
        cardDetails.pinNumber="1234";

        String msg=processingService.login(cardDetails);
        System.out.println(msg);

    }
}
