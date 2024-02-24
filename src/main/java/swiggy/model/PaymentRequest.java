package swiggy.model;

import java.util.Date;

public class PaymentRequest {
    private  String txId;
    private  double amt;
    private Date txnDate;
    private  String merchantId;
    private  boolean merchantDebit;
    public boolean isMerchantDebit() {
        return merchantDebit;
    }


    public PaymentRequest( double amt, Date txnDate) {
        this.amt = amt;
        this.txnDate = txnDate;
    }

    public PaymentRequest(String txId, double amt, Date txnDate, String merchantId, boolean merchantDebit) {
        this.txId = txId;
        this.amt = amt;
        this.txnDate = txnDate;
        this.merchantId = merchantId;
        this.merchantDebit = merchantDebit;
    }

    public String getTxId() {
        return txId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public String getMerchantId() {
        return merchantId;
    }


}
