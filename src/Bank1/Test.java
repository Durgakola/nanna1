package Bank1;

public class Test {
    public static void main(String[] args) {
        CardProcessingService processingService=new CardProcessingService();
        CardDetails cardDetails=new CardDetails();
        System.out.println(cardDetails.hashCode());

        cardDetails.cardNumber="123456";
        cardDetails.pinNumber="1234";

           boolean loginStatus = processingService.login(cardDetails);
        CreditService creditService=new CreditService();
        if(loginStatus){
            int balance=creditService.credit("12345",100);
            System.out.println(balance);
            System.out.println("CreditService hashcode"+creditService.hashCode());

//            CreditService creditService1=new CreditService();
            int balance1=creditService.credit("12345",100);
            System.out.println("CreditService1 hashcode"+creditService.hashCode());
            System.out.println(balance1);

        }

    }
}
