package bankTrancfer;

public class SbiBankService  extends  RBIBankService{

    public  int sbiCredetes(int amount){
       credite = credite + amount;
       return credite;

    }
    @Override
    public int creadetedAmount() {

        return credite;
    }
}
