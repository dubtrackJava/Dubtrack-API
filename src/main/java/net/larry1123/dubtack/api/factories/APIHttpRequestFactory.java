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
package net.larry1123.dubtack.api.factories;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;

import java.io.IOException;

/**
 * Truly this is just a placeholder right now
 * <p>
 * This is closer to what I want but needs more work...
 *
 * @author Larry1123
 * @since 0.1.0
 */
public class APIHttpRequestFactory {

    public static APIHttpRequestFactory apiRequestFactory = new APIHttpRequestFactory();

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new GsonFactory();

    private HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {

        @Override
        public void initialize(HttpRequest request) {
            request.setParser(new JsonObjectParser(JSON_FACTORY));
        }

    });

    private String urlBase = "https://api.dubtrack.fm";

    // this resource retrieves a list of user playlists
    public HttpRequest getPlaylist() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/playlist"));
    }

    // Create a playlist
    public HttpRequest postPlaylist() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/playlist"), null);
    }

    // this resource retrieves songs in a playlist
    // TODO /playlist/{playlistid} is 404 /playlist/{[playlistid}/songs has the wanted function
    public HttpRequest getPlaylistId() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/playlist/{playlistid}"));
    }

    // Delete a playlist
    public HttpRequest deletePlaylistId() throws IOException {
        return requestFactory.buildDeleteRequest(new GenericUrl(urlBase + "/playlist/{playlistid}"));
    }

    // Add a song to playlist
    public HttpRequest postPlaylistIdSongs() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/playlist/{playlistid}/songs"), null);
    }

    // Remove a song from playlist
    public HttpRequest deletePlaylistIdSongsId() throws IOException {
        return requestFactory.buildDeleteRequest(new GenericUrl(urlBase + "/playlist/{playlistid}/songs/{songid}"));
    }

    // Get room playlist history
    public HttpRequest getRoomHistory() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist/history"));
    }

    // Get room active song dubs
    public HttpRequest getRoomActiveDubs() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist/active/dubs"));
    }

    // Dubup or down current song
    public HttpRequest postRoomActiveDubs() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist/active/dubs"), null);
    }

    // Get room active song
    public HttpRequest getRoomPlaylist() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist/active"));
    }

    // Get room active song
    public HttpRequest postRoomPlaylist() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist/active"), null);
    }

    // Get user room queue
    public HttpRequest getUserRoomQueue() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/user/session/room/{roomid}/queue"));
    }

    // Send a message on the chat
    public HttpRequest postChat() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/chat/{roomid}"), null);
    }

    // Returns a list of active rooms
    public HttpRequest getRoom() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room"));
    }

    // creates a room (there is a limit of 5 rooms per user)
    public HttpRequest postRoom() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/room"), null);
    }

    // Returns room details.
    public HttpRequest getRoomId() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}"));
    }

    // Hey look something that is not listed!
    // Get list of Users!
    public HttpRequest getRoomIdUsers() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/users"));
    }

    // Join room, if user.muted is set to true user shouldn't send chat requests
    public HttpRequest postRoomIdUsers() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/room/{roomid}/users"), null);
    }

    // Get RoomUser Info!
    public HttpRequest getRoomIdUsersId() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/users/{userid}"));
    }

    // Leave room
    public HttpRequest deleteRoomIdUsers() throws IOException {
        return requestFactory.buildDeleteRequest(new GenericUrl(urlBase + "/room/{roomid}/users"));
    }

    // Returns list of users in the room's playlist
    public HttpRequest getRoomIdPlaylist() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist"));
    }

    // Returns a list of songs in the room's playlist
    public HttpRequest getRoomIdPlaylistDetails() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/room/{roomid}/playlist/details"));
    }

    // Returns a JSON object with user details
    public HttpRequest getUserId() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/user/{userid}"));
    }

    // Returns an image source
    public HttpRequest getUserIdImage() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/user/{userid}/image"));
    }

    // Returns a large image source
    public HttpRequest getUserIdImageLarge() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/user/{userid}/image/large"));
    }

    // get a list of people following
    public HttpRequest getUserIdFollowing() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/user/{userid}/following"));
    }

    // Follow user
    public HttpRequest postUserIdFollowing() throws IOException {
        return requestFactory.buildPostRequest(new GenericUrl(urlBase + "/user/{userid}/following"), null);
    }

    // Unfollow user
    public HttpRequest deleteUserIdFollowing() throws IOException {
        return requestFactory.buildDeleteRequest(new GenericUrl(urlBase + "/user/{userid}/following"));
    }

    // get a list of followers
    public HttpRequest getUserIdFollows() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/user/{userid}/follows"));
    }

    // Get a list of songs
    public HttpRequest getSong() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/song"));
    }

    // Get song details
    public HttpRequest getSongId() throws IOException {
        return requestFactory.buildGetRequest(new GenericUrl(urlBase + "/song/{songid}"));
    }


}
