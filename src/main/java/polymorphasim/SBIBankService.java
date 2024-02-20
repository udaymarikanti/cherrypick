package polymorphasim;

public class SBIBankService extends RBIBankService{
    @Override
    public double calculateInterest(int principleAmount) {
        double toatalAmout = 0;
            double intrestAmout = super.calculateInterest(principleAmount);
            toatalAmout   = intrestAmout + principleAmount;

        return toatalAmout;

    }
    public double calculateInterest(int principleAmount,int days) {

        double totalAmount = 0;
        if(days>85){
            return  this.calculateInterest(principleAmount);

        }
        return totalAmount + principleAmount;
    }
}
