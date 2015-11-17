package cat.pomf.dubtack.api;

import cat.pomf.dubtack.api.auth.DubtrackAccount;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class DubtrackApi {

    private DubtrackAccount account;

    public DubtrackApi(DubtrackAccount account) {
        this.account = account;
    }

    public void login() {
        // get dubtrack account, check if type is token or pw, login with it.
    }

}
