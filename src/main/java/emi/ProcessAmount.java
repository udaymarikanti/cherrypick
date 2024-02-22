package emi;

public class ProcessAmount {
    double creadetedAmount = 0;
    public  double processAmount( int processingAmount,double intresest){
        double processingFee =processingAmount  *  intresest / 100;

         creadetedAmount= processingAmount - processingFee;

        return creadetedAmount;

    }
    public  double calculateInterest(int principleAmount) {
        int duration = 3;
        double interest = (principleAmount * 0.25) * (2.4 / 100);
        System.out.println("RBI intrest  :" + interest);
        return interest;
    }
}
