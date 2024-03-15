package swiggyDemo;

public abstract class Login {
    public String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public abstract boolean login() throws SwiggyException;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
