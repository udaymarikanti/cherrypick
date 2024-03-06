package bookMyShowDemo;

public class BookMyShowException extends Exception{
    String errorCode;
    public BookMyShowException(String message,String errorCode) {
        super(message);
        this.errorCode= errorCode;
    }
    public BookMyShowException(String message){
        super(message);
    }

}
