package cat.pomf.dubtack.api.auth;

/**
 * @author Banksy
 * @since 0.1.0
 */
public class DubtrackAccount {

    private String username;
    private String password;
    private String token;
    private AccountType accountType;

    public DubtrackAccount(String username, String password) {
        this.username = username;
        this.password = password;
        this.accountType = AccountType.LOGIN;
    }

    public DubtrackAccount(String token) {
        this.token = token;
        this.accountType = AccountType.TOKEN;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    private enum AccountType {
        LOGIN,
        TOKEN
    }

}
