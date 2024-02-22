package bankTrancfer;

public class HdfcBankService  extends  RBIBankService{
    public  int  hdfcCredetes(int amount){
        credite = credite + amount;
        return credite;

    }
    public int creadetedAmount() {
        return credite;
    }

}
