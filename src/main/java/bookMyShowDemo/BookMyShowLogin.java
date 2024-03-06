package bookMyShowDemo;

public class BookMyShowLogin {
    String localUserName = "uday";
    String localPassword = "1234";
    private  String userName;
    private String password;

    public BookMyShowLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public  boolean login() throws BookMyShowException {
        if(localUserName.equals(getUserName()) && localPassword.equals(getPassword())){
            System.out.println("login successfully  ");
        }
        else {

            System.out.println("login failed ");
           throw new BookMyShowException(ErrorCode.LOGIN_FAILED_EXCEPTION.message,ErrorCode.LOGIN_FAILED_EXCEPTION.code);

        }
            return  true;
    }
}
