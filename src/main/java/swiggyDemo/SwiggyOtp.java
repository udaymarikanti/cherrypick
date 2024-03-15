package swiggyDemo;

public class SwiggyOtp {

    int otp ;
    public int genarateOtp(LoginProcess loginProcess) throws SwiggyException {
        if(loginProcess.login()){
            otp = 1234;
        }else {
            System.out.println("Otp generation failed ");
        }
        return otp;
    }
}
