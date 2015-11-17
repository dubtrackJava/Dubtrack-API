package cat.pomf.dubtack.api.auth;

/**
 * Created by root on 11/16/2015.
 */
public class DubtrackAccount {
    private String username, password, token;
    private AccountType accountType;
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public DubtrackAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.accountType = AccountType.LOGIN;
    }

    public DubtrackAccount(String token){
        this.token = token;
        this.accountType = AccountType.TOKEN;
    }

    private enum AccountType{
        LOGIN,
        TOKEN;
    }


}
