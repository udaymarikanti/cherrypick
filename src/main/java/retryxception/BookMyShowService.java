package retryxception;

import evenOddException.OddNumberException;

public class BookMyShowService {
    public  void  bookTIcket() throws OddNumberException {
        for (int i = 1; i < 3; i++) {
            try {
                SBIservice sbIservice = new SBIservice();
                sbIservice.transfer();
            } catch (TimeOutException timeOutException) {
                System.out.println(" error occures " + timeOutException);
            }
        }
    }
}
