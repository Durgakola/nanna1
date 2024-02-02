package Bank;

public class Test {
    public static void main(String[] args) {
        CardProcessingService cardProcessingService=new CardProcessingService();
        CardDetalis cardDetalis=new CardDetalis();
        System.out.println(cardDetalis.hashCode());
        cardDetalis.cardNumber="12345";
        cardDetalis.PinNumber="1234";

       boolean loginStatus= cardProcessingService.login(cardDetalis);
       CreditService creditService=new CreditService();
       if(loginStatus){
          int balanvce1= creditService.credit("12345",100);
           System.out.println(balanvce1);
           System.out.println("creditService hashCode"+creditService.hashCode());

//           CreditService creditService1=new CreditService();
           int balance2=creditService.credit("12345",100);
           System.out.println("creditService hashCode"+creditService.hashCode());
           System.out.println(balance2);

       }
    }
}
