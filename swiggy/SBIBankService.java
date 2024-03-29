package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponce;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {
    private String accountNumber="1234";
    private double amt=5000;

    private String marchantAccountNumber="5555";

    private double merchantAmt=1000;

    public PaymentResponce transfer(PaymentRequest request) {

        System.out.println(request.getTxId());

        if (request.isMerchantDebit()) {
            merchantAmt=merchantAmt- request.getAmt();
            amt = amt + request.getAmt();
        }else{
            amt=amt- request.getAmt();
            merchantAmt=merchantAmt+ request.getAmt();
        }
        PaymentResponce responce=new PaymentResponce(UUID.randomUUID().toString(),"Success",new Date());
        return responce;
    }
}
