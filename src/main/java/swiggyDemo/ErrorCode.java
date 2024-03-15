package swiggyDemo;

public enum ErrorCode {
    LOGIN_FAILED("404","YOURE LOGIN FAILED "),
    PAYMENT_FAILED("404","PAYMENT FAILED ");
    String code;
    String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
