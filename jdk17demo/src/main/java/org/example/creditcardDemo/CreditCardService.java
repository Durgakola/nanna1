package org.example.creditcardDemo;

import java.util.Date;
import java.util.UUID;

public class CreditCardService {
    public CreditCard card(User user){
        CreditCard creditCard = new CreditCard();
        creditCard.holderName = user.name;
        creditCard.cardNo = UUID.randomUUID().toString();
        creditCard.bankName = "sbi";
        creditCard.cvv = UUID.randomUUID().toString();
        creditCard.cardExpiry =  new Date();
        return creditCard;



    }
}