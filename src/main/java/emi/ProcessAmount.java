package emi;

public class ProcessAmount {
    double creadetedAmount = 0;
    public  double processAmount( int processingAmount,double intresest){
        double processingFee =processingAmount  *  intresest / 100;

         creadetedAmount= processingAmount - processingFee;

        return creadetedAmount;

    }
}
