package Bank1;

public class CardProcessingService {
    public boolean login(CardDetails card){
        System.out.println(card.hashCode());

        String localcardNumber="123456";
        String localpinNumber="1234";

        if(localcardNumber.equals(card.cardNumber) && (localpinNumber.equals(card.pinNumber))){
            return true;
        }
        else{
            return false;
        }
    }
}

