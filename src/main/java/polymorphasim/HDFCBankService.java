package polymorphasim;

public class HDFCBankService extends RBIBankService{
    public double calculateInterest(int principleAmount) {
        double toatalAmout = 0;
        double intrestAmout = super.calculateInterest(principleAmount);
        toatalAmout   = intrestAmout + principleAmount;

        return toatalAmout;

    }
    public double calculateInterest(int principleAmount,int days) {

        double totalAmount = 0;
        if(days>89){
            return this.calculateInterest(principleAmount);

        }
        return totalAmount + principleAmount;
    }

    }
