package polymorphasim;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
       double sbiserviceIntrest =  sbiBankService.calculateInterest(1000,86);
        System.out.println("sbi bank " + sbiserviceIntrest);

        HDFCBankService hdfcBankService = new HDFCBankService();
      double hdfcBankIntrest =   hdfcBankService.calculateInterest(1000,88);
        System.out.println("hdfc bank : " + hdfcBankIntrest);
    }
}
