package cat.pomf.dubtack.api.auth;

/**
 * @author Banksy
 * @since 0.1.0
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
