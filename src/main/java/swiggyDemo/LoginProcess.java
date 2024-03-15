package swiggyDemo;

public class LoginProcess extends Login{
    String localusername="vipteam";
    String localpassword="vip";

    public LoginProcess(String username, String password) {
        super(username, password);
    }
    @Override
    public boolean login() throws SwiggyException {
        if(localusername.equals(getUsername()) && localpassword.equals(getPassword())){
            System.out.println("Swiggy login successful");
        }
        else{
            System.out.println("Swiggy  login failed username or password is wrong");
            throw new SwiggyException(ErrorCode.LOGIN_FAILED.message,ErrorCode.LOGIN_FAILED.code);
        }
        return true;
    }
}
