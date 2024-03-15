package swiggyDemo;

public class SwiggyException extends Exception{
    String code;
    public SwiggyException(String message ,String code ) {
        super(message);
        this.code = code;
    }
}
