package interfaceLatest;

public class SBIBankLoginProcess implements  BankLoginService{

    BankOTPValidationService sbiBankLoginService;

    public SBIBankLoginProcess(){
        this.sbiBankLoginService = new SBIBankLoginService();
    }

    public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService){
       this. sbiBankLoginService =  sbiBankLoginService;
    }

    @Override
    public boolean login(String userName, String password) {
        if (sbiBankLoginService.login(userName, password)){
            String otp = sbiBankLoginService.genarateOTP(userName);
            boolean validateOtp= sbiBankLoginService.validationOTP(otp);
            if (validateOtp) {

                System.out.println("valid otp and login successfull");
            }else {
                System.out.println("invalid otp and login faild ");
            }
            return validateOtp;
        } else {
            System.out.println("invalid credentials");
            return false;
        }
    }
}
