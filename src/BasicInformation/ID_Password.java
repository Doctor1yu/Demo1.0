package BasicInformation;

public class ID_Password {
    static String account;
    static String password;

    public ID_Password(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public ID_Password() {

    }

    public static String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public static String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
