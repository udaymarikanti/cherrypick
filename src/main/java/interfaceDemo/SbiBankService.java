package interfaceDemo;

public class SbiBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccuntNumber, String toAccountNumber, int amount) {
        return "trnsfer request from the SBI Bank";
    }
}
