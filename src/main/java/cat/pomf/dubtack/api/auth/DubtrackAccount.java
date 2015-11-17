package cat.pomf.dubtack.api.auth;

/**
 * Created by root on 11/16/2015.
 */
public class DubtrackAccount {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public DubtrackAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
