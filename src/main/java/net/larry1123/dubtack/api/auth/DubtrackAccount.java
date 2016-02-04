/*
 * Copyright 2015 ElecEntertainment & Pomf.cat
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.larry1123.dubtack.api.auth;

/**
 * @author Banksy
 * @since 0.1.0
 *
 * TODO remove in favor of more abstract classes
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
