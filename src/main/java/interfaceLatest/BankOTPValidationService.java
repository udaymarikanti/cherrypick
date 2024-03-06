package interfaceLatest;

public interface BankOTPValidationService extends BankLoginService {
    String genarateOTP(String accountnumber);
    boolean validationOTP(String otp);
}
