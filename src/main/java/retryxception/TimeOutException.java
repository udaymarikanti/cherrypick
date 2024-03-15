package retryxception;

public class TimeOutException extends  RuntimeException {
    private  String errorCode;
    private  String errorMessage;

    public TimeOutException(String code,String message){
        this.errorCode = code;
        this.errorMessage = message;
    }
}

