package swiggyDemo;

public class NetBanking extends OtpValidation {
    int accountBalance = 10000;
    double remaingBal;

    String statusCode;
    SwiggyOtp swiggyOtp;
    LoginProcess loginProcess;

    public String swiggypayment(Coupons coupons, String nextProcess) throws SwiggyException {

        remaingBal = accountBalance - coupons.finalAmount;
        System.out.println("bank balance  :  " + accountBalance);

        if (otpValidation(swiggyOtp,loginProcess)) {
            System.out.println("payed amount :  " + coupons.finalAmount);
            System.out.println("payment successful remaining balance : " + remaingBal);
            System.out.println("your payment is successfully completed and moved to vendor for delivery");
            return statusCode = "200";
        } else {
            double newAccountBalance = remaingBal + coupons.finalAmount;
            statusCode = "404";

            System.out.println("your total amount  : " + newAccountBalance);
            System.out.println("your cancellation is successful ");
            throw new SwiggyException(ErrorCode.PAYMENT_FAILED.message, ErrorCode.PAYMENT_FAILED.code);

        }
    }
}
