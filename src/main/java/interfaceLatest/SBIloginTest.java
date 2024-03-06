package interfaceLatest;

public class SBIloginTest {
    public static  void  main(String[] args){
      //  SBIBankLoginProcess sbiBankLoginProcess = new SBIBankLoginProcess();
      //  sbiBankLoginProcess.login("1111","1234");
        BankLoginService loginService = new SBIBankLoginProcess();
       boolean loginStatus =  loginService.login("1111","1234");


       if(loginStatus){
           System.out.println(" login successfull");
       }else {
           System.out.println("login faild");
       }


    }
}
