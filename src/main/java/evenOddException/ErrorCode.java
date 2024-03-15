package evenOddException;

public enum ErrorCode {
    EVEN_NUMBER("EVEN ","404"),
    ODD_NUMBER("odd","404");
    String message ;
    String code;

    ErrorCode(String message, String code) {
        this.message = message;
        this.code = code;
    }
}
