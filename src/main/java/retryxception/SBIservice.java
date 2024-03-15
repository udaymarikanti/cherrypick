package retryxception;

import evenOddException.OddNumberException;

public class SBIservice {
    int i = 0;
    public String transfer() throws OddNumberException {
        i  = i +1;
        if(i % 2==0){

            throw new InsufficientFundsException(ErrorCodes.INSUFFICENTFUNDS_ERROR_CODE.getMessage(),ErrorCodes.INSUFFICENTFUNDS_ERROR_CODE.getCode());


        }else {
            throw new TimeOutException(ErrorCodes.TIME_OUT_ERROR_CODE.getMessage(),ErrorCodes.TIME_OUT_ERROR_CODE.getCode());
        }

    }
}
