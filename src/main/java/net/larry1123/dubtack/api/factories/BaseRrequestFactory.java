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

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.BaseRequest;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;

/**
 * Truly this is just a placeholder right now
 *
 * @author Larry1123
 * @since 0.1.0
 */
public class BaseRrequestFactory {

    public static BaseRrequestFactory requestFactory = new BaseRrequestFactory();

    String urlBase = "https://api.dubtrack.fm";

    // this resource retrieves a list of user playlists
    public HttpRequest getPlaylist() {
        return Unirest.get(urlBase + "/playlist");
    }

    // Create a playlist
    public HttpRequestWithBody postPlaylist() {
        return Unirest.post(urlBase + "/playlist");
    }

    // this resource retrieves songs in a playlist
    // TODO /playlist/{playlistid} is 404 /playlist/{[playlistid}/songs has the wanted function
    public HttpRequest getPlaylistId() {
        return Unirest.get(urlBase + "/playlist/{playlistid}");
    }

    // Delete a playlist
    public HttpRequestWithBody deletePlaylistId() {
        return Unirest.delete(urlBase + "/playlist/{playlistid}");
    }

    // Add a song to playlist
    public HttpRequestWithBody postPlaylistIdSongs() {
        return Unirest.post(urlBase + "/playlist/{playlistid}/songs");
    }

    // Remove a song from playlist
    public HttpRequestWithBody deletePlaylistIdSongsId() {
        return Unirest.delete(urlBase + "/playlist/{playlistid}/songs/{songid}");
    }

    // Get room playlist history
    public HttpRequest getRoomHistory() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/history");
    }

    // Get room active song dubs
    public HttpRequest getRoomActiveDubs() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/active/dubs");
    }

    // Dubup or down current song
    public HttpRequestWithBody postRoomActiveDubs() {
        return Unirest.post(urlBase + "/room/{roomid}/playlist/active/dubs");
    }

    // Get room active song
    public HttpRequest getRoomPlaylist() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/active");
    }

    // Get room active song
    public HttpRequestWithBody postRoomPlaylist() {
        return Unirest.post(urlBase + "/room/{roomid}/playlist/active");
    }

    // Get user room queue
    public HttpRequest getUserRoomQueue() {
        return Unirest.get(urlBase + "/user/session/room/{roomid}/queue");
    }

    // Send a message on the chat
    public HttpRequestWithBody postChat() {
        return Unirest.post(urlBase + "/chat/{roomid}");
    }

    // Returns a list of active rooms
    public HttpRequest getRoom() {
        return Unirest.get(urlBase + "/room");
    }

    // creates a room (there is a limit of 5 rooms per user)
    public HttpRequestWithBody postRoom() {
        return Unirest.post(urlBase + "/room");
    }

    // Returns room details.
    public HttpRequest getRoomId() {
        return Unirest.get(urlBase + "/room/{roomid}");
    }

    // Hey look something that is not listed!
    // Get list of Users!
    public HttpRequest getRoomIdUsers() {
        return Unirest.get(urlBase + "/room/{roomid}/users");
    }

    // Join room, if user.muted is set to true user shouldn't send chat requests
    public HttpRequestWithBody postRoomIdUsers() {
        return Unirest.post(urlBase + "/room/{roomid}/users");
    }

    // Get RoomUser Info!
    public HttpRequest getRoomIdUsersId() {
        return Unirest.get(urlBase + "/room/{roomid}/users/{userid}");
    }

    // Leave room
    public HttpRequestWithBody deleteRoomIdUsers() {
        return Unirest.delete(urlBase + "/room/{roomid}/users");
    }

    // Returns list of users in the room's playlist
    public HttpRequest getRoomIdPlaylist() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist");
    }

    // Returns a list of songs in the room's playlist
    public HttpRequest getRoomIdPlaylistDetails() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/details");
    }

    // Returns a JSON object with user details
    public HttpRequest getUserId() {
        return Unirest.get(urlBase + "/user/{userid}");
    }

    // Returns an image source
    public HttpRequest getUserIdImage() {
        return Unirest.get(urlBase + "/user/{userid}/image");
    }

    // Returns a large image source
    public BaseRequest getUserIdImageLarge() {
        return Unirest.get(urlBase + "/user/{userid}/image/large");
    }

    // get a list of people following
    public HttpRequest getUserIdFollowing() {
        return Unirest.get(urlBase + "/user/{userid}/following");
    }

    // Follow user
    public HttpRequestWithBody postUserIdFollowing() {
        return Unirest.post(urlBase + "/user/{userid}/following");
    }

    // Unfollow user
    public HttpRequestWithBody deleteUserIdFollowing() {
        return Unirest.delete(urlBase + "/user/{userid}/following");
    }

    // get a list of followers
    public HttpRequest getUserIdFollows() {
        return Unirest.get(urlBase + "/user/{userid}/follows");
    }

    // Get a list of songs
    public HttpRequest getSong() {
        return Unirest.get(urlBase + "/song");
    }

    // Get song details
    public HttpRequest getSongId() {
        return Unirest.get(urlBase + "/song/{songid}");
    }

}
