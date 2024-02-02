package Bank1;


public class CardProcessingService1 {
    public String login(CardDetails1 cardDetails1){
        String localCardNumber="12345";
        String localPinNumber="123456";
        System.out.println(cardDetails1.hashCode());
        if(localCardNumber.equals(cardDetails1)&&localPinNumber.equals(cardDetails1)){
            return "login successful";
        }
        else{
            return "login failed";
        }
    }
}
