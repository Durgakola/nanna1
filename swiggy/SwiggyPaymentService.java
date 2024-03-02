package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponce;

public interface SwiggyPaymentService {
    PaymentResponce payment(PaymentRequest request);


}
