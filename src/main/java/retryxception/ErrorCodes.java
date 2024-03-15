package retryxception;

public enum ErrorCodes {
    TIME_OUT_ERROR_CODE("1000","time out  exception"),
    INSUFFICENTFUNDS_ERROR_CODE("1001","insufficent EXCEPTION");

    private String code;
    private  String message;

    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
