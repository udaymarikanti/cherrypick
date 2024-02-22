package interfaceDemo;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccuntNumber, String toAccountNumber, int amount) {
        return "REQUEST FROM THE HDFC BANK";
    }
}
