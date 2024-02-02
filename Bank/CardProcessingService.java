package Bank;

public class CardProcessingService {
    public boolean login(CardDetalis card){
        System.out.println(card.hashCode());
        String localCardNumber="12345";
        String localPinNumber="1234";
        if (localCardNumber.equals(card.cardNumber) && localPinNumber.equals(card.PinNumber)){
            return true;
        }
        else{
            return false;
        }
    }
}
