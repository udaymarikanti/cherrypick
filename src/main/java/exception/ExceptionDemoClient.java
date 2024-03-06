package exception;

public class ExceptionDemoClient {
    public static void main(String[] args) {
        ExceptionService exceptionService = new ExceptionService();
        CustiomExceptionService custiomExceptionService = new CustiomExceptionService();
        custiomExceptionService.checkedExceptions();
       // custiomExceptionService.checkedExceptions2();
        custiomExceptionService.uncheckedException();
        exceptionService.greet(null);
    }
}
