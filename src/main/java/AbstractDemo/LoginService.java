package AbstractDemo;

public class LoginService extends Account{

    String localUserName = "uday";
    String localPasword = "1234";


    @Override
    public String login(String username, String passowrd) {
        if(localUserName.equals(username)&& localPasword.equals(passowrd)){
            System.out.println("login successfully");
        }else {
            System.out.println("login failed : ");
        }
        return null;
    }
}
