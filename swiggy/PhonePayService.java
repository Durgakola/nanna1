package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponce;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {

    @Override
    public PaymentResponce payment(PaymentRequest request) {

        PaymentRequest paymentInitationRequest=new PaymentRequest("Swiggy"+ UUID.randomUUID().toString(),
                request.getAmt(),request.getTxDate(),"5555",false);

        SBIBankService sbiBankService=new SBIBankService();

        return sbiBankService.transfer(paymentInitationRequest);
    }
}
