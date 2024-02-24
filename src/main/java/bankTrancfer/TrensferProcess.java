package bankTrancfer;

public class TrensferProcess extends  RBIBankService{
    int extraAmount ;
    int remaingBalanceInBank ;
    int debitedAmount ;
    public int creadetedAmountProcess(HdfcBankService hdfcBankService,SbiBankService sbiBankService) {


        int sbiCreditedAmount = sbiBankService.creadetedAmount();
        int hdfcCreditedAmount = hdfcBankService.creadetedAmount();

        System.out.println("SBI Credited Amount: " + sbiCreditedAmount);
        System.out.println("HDFC Credited Amount: " + hdfcCreditedAmount);

        if(sbiCreditedAmount>hdfcCreditedAmount){
            extraAmount = sbiBankService.creadetedAmount()-hdfcBankService.creadetedAmount();

            remaingBalanceInBank = sbiBalance -extraAmount;
            debitedAmount = hdfcBalance+extraAmount;

            System.out.println("debit amount from HDFC : " + debitedAmount);
            System.out.println("extra amount at  SBI " +extraAmount);

            System.out.println("new SBI AMOUNT  at RBI from SBI BANK " + remaingBalanceInBank);

        }else {

            extraAmount =  hdfcBankService.creadetedAmount()-sbiBankService.creadetedAmount();
            remaingBalanceInBank =hdfcBalance-extraAmount;
            debitedAmount = sbiBalance+extraAmount;

            System.out.println("new  amount from SBI : " +debitedAmount);
            System.out.println("extra amount from HDFC " +extraAmount);
            System.out.println("new HDFC  amount at RBI from HDFC BANK " + remaingBalanceInBank);

        }
        return extraAmount;
    }

    @Override
    public int creadetedAmount() {

        return 0;
    }
}


