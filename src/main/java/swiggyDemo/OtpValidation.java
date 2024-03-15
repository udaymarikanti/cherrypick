package swiggyDemo;

public class OtpValidation implements PaymentOtp{

    @Override
    public boolean otpValidation(SwiggyOtp swiggyOtp,LoginProcess loginProcess)  {
        try {
            if(swiggyOtp.otp==swiggyOtp.genarateOtp(loginProcess)){
                System.out.println(" otp validation success " );
            }else{
                System.out.println("otp validation failed");

            }
        } catch (SwiggyException e) {
            System.out.println(" otp validation faild"+e.getMessage());
        }
        return true;
    }


}
