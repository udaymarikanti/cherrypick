package swiggy;

import swiggy.model.PaymentRequest;
import swiggy.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {
    public  String accountNumber = "1234";
    private  double amt = 5000;
    public  String merchantAccountNumber = "2222";
    private  double merchantAmt = 1000;

    public PaymentResponse trnsfer(PaymentRequest request){
        System.out.println(request.getTxId());
        if(request.isMerchantDebit()){
            merchantAmt = merchantAmt - request.getAmt();
            amt = amt + request.getAmt();
        }else {
            amt = amt - request.getAmt();
            merchantAmt = merchantAmt + request.getAmt();
        }
        PaymentResponse response = new PaymentResponse(UUID.randomUUID().toString(),"Sucess",
                new Date());
        return  response;
    }

}
