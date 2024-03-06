package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {
    @Override
    public PaymentResponse payment(PaymentRequest request) {

        SBIBankService sbiBankService = new SBIBankService();

        return sbiBankService.trnsfer(request);

    }
}
