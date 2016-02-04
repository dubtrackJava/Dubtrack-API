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

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class EmailAuthenticator implements Authenticator {

    private final String username;
    // Likely will not store this info
    private final String password;

    public EmailAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public Token authenticate(/* Thinking of having String pass idk */) {
        // This is just a proof of concept method body
        // This will be redone soon
        try {
            HttpResponse<JsonNode> jsonNodeHttpResponse = Unirest.post("https://api.dubtrack.fm/auth/dubtrack").field("username", username).field("password", password).asJson();
            String cookies = jsonNodeHttpResponse.getHeaders().getFirst("set-cookie");
            Properties properties = new Properties();
            properties.load(new StringReader(cookies.replace("; ", "\n")));
            return new Token((String) properties.get("connect.sid"));
        }
        catch (UnirestException e) {
            // TODO
        }
        catch (IOException e) {
            // This should not be able to happen lol
            e.printStackTrace();
        }
        return null;
    }

}
