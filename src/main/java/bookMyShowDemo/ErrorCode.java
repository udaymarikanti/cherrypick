package bookMyShowDemo;

public enum ErrorCode {
    LOGIN_FAILED_EXCEPTION("loginfaied","404"),
    OTP_GENERATION_FAILED("otpgenaration failed","404"),
    BOOKING_PROCESS_FAILED("process failed","404"),
    PAYMENT_FAILD("PayMentFaild","404")

    ;
    String message;
    String code;

    ErrorCode(String message, String code) {
        this.code = code;
        this.message = message;
    }
}
