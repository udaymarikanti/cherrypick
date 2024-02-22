package bankTrancfer;

public class TrensferProcess extends  RBIBankService{
    int extraAmount ;
    int remaingBalanceInBank ;
    int debitedAmount ;
    public int creadetedAmount() {

        SbiBankService sbiBankService = new SbiBankService();
        HdfcBankService hdfcBankService = new HdfcBankService();

        sbiBankService.sbiCredetes(4000);
        sbiBankService.sbiCredetes(3000);
        sbiBankService.sbiCredetes(8000);
        System.out.println(sbiBankService.creadetedAmount());

        hdfcBankService.hdfcCredetes(3500);
        hdfcBankService.hdfcCredetes(7000);
        hdfcBankService.hdfcCredetes(2000);
        System.out.println(hdfcBankService.creadetedAmount());

        int sbiCreditedAmount = sbiBankService.creadetedAmount();
        int hdfcCreditedAmount = hdfcBankService.creadetedAmount();

        System.out.println("SBI Credited Amount: " + sbiCreditedAmount);
        System.out.println("HDFC Credited Amount: " + hdfcCreditedAmount);

        if(sbiCreditedAmount>hdfcCreditedAmount){
            extraAmount = sbiBankService.credite-hdfcBankService.credite;
            System.out.println("extra amount at  SBI " +extraAmount);

            remaingBalanceInBank = sbiBalance +extraAmount;
            debitedAmount = hdfcBalance-extraAmount;

            System.out.println("debit amount from HDFC : " + debitedAmount);
            System.out.println("remaing amount at RBI from SBI BANK " + remaingBalanceInBank);

        }else {

            extraAmount =  hdfcBankService.creadetedAmount()-sbiBankService.creadetedAmount();
            remaingBalanceInBank =hdfcBalance+extraAmount;
            debitedAmount = sbiBalance-extraAmount;

            System.out.println("new  amount from SBI : " +debitedAmount);
            System.out.println("extra amount from HDFC " +extraAmount);
            System.out.println("new HDFC  amount at RBI from HDFC BANK " + remaingBalanceInBank);

        }
        return extraAmount;
    }
}


