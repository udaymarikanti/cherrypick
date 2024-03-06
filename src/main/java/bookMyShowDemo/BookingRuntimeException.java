package bookMyShowDemo;

public class BookingRuntimeException extends RuntimeException{
    String errorCode;
    public BookingRuntimeException(String message, String errorCode) {
        super(message);
        this.errorCode= errorCode;
    }
    public BookingRuntimeException(String message){
        super(message);
    }
}
