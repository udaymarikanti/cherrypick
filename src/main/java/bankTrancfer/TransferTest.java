package bankTrancfer;

public class TransferTest {

    public static void main(String[] args) {


        SbiBankService sbiBankService = new SbiBankService();
        HdfcBankService hdfcBankService = new HdfcBankService();

        sbiBankService.sbiCredetes(4000);
        sbiBankService.sbiCredetes(3000);
        sbiBankService.sbiCredetes(8000);
        System.out.println(sbiBankService.creadetedAmount());

        hdfcBankService.hdfcCredetes(9000);
        hdfcBankService.hdfcCredetes(7000);
        hdfcBankService.hdfcCredetes(5000);
        System.out.println(hdfcBankService.creadetedAmount());


        TrensferProcess trensferProcess = new TrensferProcess();

        System.out.println(" transfer process " +trensferProcess.creadetedAmountProcess(hdfcBankService,sbiBankService));

    }
}
