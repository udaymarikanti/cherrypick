package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

public interface SwiggyPaymentService {

   public PaymentResponse payment (PaymentRequest request);



}
