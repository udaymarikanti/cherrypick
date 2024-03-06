package exception;

public class CustiomExceptionService {

    public String checkedExceptions(){

        try {
            throw new Exception("throuw checked  ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println(" from checked Exception method finally block ");
        }

    }

    public String checkedExceptions2() throws Exception {
        throw new Exception("throuw checked  222 ");    }

    public  String uncheckedException(){
        throw new RuntimeException("throuw checked  ");

    }
}
