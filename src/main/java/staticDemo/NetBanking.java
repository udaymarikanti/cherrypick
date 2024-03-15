package staticDemo;

public class NetBanking {
    String userId ="12345";
    String password = "1234";
      NetBanking(){
        String userId ="12345";
        String password = "1234";
    }

    public  static  String name = "uday";
    public  static  String accountNumber = "9848759565";

    public static String onLineLogin(String userId,String password){
        if(userId.equals(userId) && password.equals(password))
        {
            System.out.println("login successfully");
        }
        return  "login failed";


    }
    public  static   String onLineLogin(String userId){
        return "login faild";

    }
    public  static    String onLineLogin(){
        return "login expert one orgument before over riding";

    }

}
