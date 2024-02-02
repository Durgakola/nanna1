package Bank1;

public class Test {
    public static void main(String[] args) {
        CardProcessingService1 cardProcessingService1=new CardProcessingService1();
        CardDetails1 cardDetails1=new CardDetails1();
        cardDetails1.cardNumber="12345";
        cardDetails1.pinNumber="123456";
        System.out.println(cardDetails1.hashCode());
        String msg=cardProcessingService1.login(cardDetails1);
        System.out.println(msg);

        }
    }
