package interfaceDemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankService hdfcBankService = new HDFCBankService();
        RBIBankService sbiBankService = new SbiBankService();
     String hdfceStatus =    hdfcBankService.transfer("123","2233",2000);
       String sbiStatus =  sbiBankService.transfer("2222","3333",2000);
        System.out.println(hdfceStatus);
        System.out.println(sbiStatus);

    }
}
