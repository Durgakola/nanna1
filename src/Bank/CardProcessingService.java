package Bank;

public class CardProcessingService {
    public String login(CardDetails card){
        String cardNumber="123456";
        String pinNumber="1234";
        System.out.println(card.hashCode());

        if(cardNumber.equals(card.cardNumber) && (pinNumber.equals(card.pinNumber))){
            return "login successful";
        }
        else{
            return "login fail";
        }
    }
}
