package bookMyShowDemo;

import java.util.UUID;

public class GenerateOtp {
      String  otp = "98765";
      String localuserNmae = "uday";


    public String generateOtp(BookMyShowLogin bookMyShowLogin,String userName) throws BookMyShowException {
        if(bookMyShowLogin.login()) {
            if (localuserNmae.equals(userName)) {

                System.out.println(" your otp is generated successfully " + otp);
            } else {
                System.out.println("otp generation is failed");
                throw new BookMyShowException(ErrorCode.OTP_GENERATION_FAILED.toString());
            }
        }
        return "";
    }
}
