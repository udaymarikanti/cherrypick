package evenOddException;

public class EvenOddTest {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd(5);

        ExceptionRepete exceptionRepete = new ExceptionRepete();

        try {
            exceptionRepete.ProcessRepete(evenOdd);
           // evenOdd.even();
        } catch (OddNumberException e) {
            System.out.println(ErrorCode.ODD_NUMBER + "   "+ e.getMessage());
        }

    }
}
