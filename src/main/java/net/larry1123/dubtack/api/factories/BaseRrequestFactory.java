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

/**
 * Truly this is just a placeholder right now
 *
 * @author Larry1123
 * @since 0.1.0
 */
public class BaseRrequestFactory {

    String urlBase = "https://api.dubtrack.fm";

    // this resource retrieves a list of user playlists
    public BaseRequest getPlaylist() {
        return Unirest.get(urlBase + "/playlist");
    }

    // Create a playlist
    public BaseRequest postPlaylist() {
        return Unirest.post(urlBase + "/playlist");
    }

    // this resource retrieves songs in a playlist
    public BaseRequest getPlaylistID() {
        return Unirest.get(urlBase + "/playlist/{playlistid}");
    }

    // Delete a playlist
    public BaseRequest deletePlaylistID() {
        return Unirest.delete(urlBase + "/playlist/{playlistid}");
    }

    // Add a song to playlist
    public BaseRequest postPlaylistIDSongs() {
        return Unirest.post(urlBase + "/playlist/{playlistid}/songs");
    }

    // Remove a song from playlist
    public BaseRequest deletePlaylistIDSongsID() {
        return Unirest.delete(urlBase + "/playlist/{playlistid}/songs/{songid]");
    }

    // Get room playlist history
    public BaseRequest getRoomHistory() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/history");
    }

    // Get room active song dubs
    public BaseRequest getRoomActiveDubs() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/active/dubs");
    }

    // Dubup or down current song
    public BaseRequest postRoomActiveDubs() {
        return Unirest.post(urlBase + "/room/{roomid}/playlist/active/dubs");
    }

    // Get room active song
    public BaseRequest getRoomPlaylist() {
        return Unirest.get(urlBase + "/room/{roomid}/playlist/active");
    }

    // Get room active song
    public BaseRequest postRoomPlaylist() {
        return Unirest.post(urlBase + "/room/{roomid}/playlist/active");
    }

    // Get user room queue
    public BaseRequest getUserRoomQueue() {
        return Unirest.get(urlBase + "/user/session/room/{roomid}/queue");
    }

    // Send a message on the chat
    public BaseRequest postChat() {
        return Unirest.get(urlBase + "/chat/{roomid}");
    }

    // Returns a list of active rooms
    public BaseRequest getRoom() {
        return Unirest.get(urlBase + "/room");
    }

    // creates a room (there is a limit of 5 rooms per user)
    public BaseRequest postRoom() {
        return Unirest.post(urlBase + "/room");
    }

    // Returns room details.
    public BaseRequest getRoomID() {
        return Unirest.get(urlBase + "/room/{id|roomUrl}");
    }

    // Join room, if user.muted is set to true user shouldn't send chat requests
    public BaseRequest postRoomIDUsers() {
        return Unirest.post(urlBase + "/room/{roomid}/users");
    }

    // Leave room
    public BaseRequest deleteRoomIDUsers() {
        return Unirest.delete(urlBase + "/room/{roomid}/users");
    }

    // Returns a JSON object with user details
    public BaseRequest getUserID() {
        return Unirest.get(urlBase + "/user/{id}");
    }

    // Returns an image source
    public BaseRequest getUserIDImage() {
        return Unirest.get(urlBase + "/user/{id}/image");
    }

    // Returns a large image source
    public BaseRequest getUserIDImageLarge() {
        return Unirest.get(urlBase + "/user/{id}/image/large");
    }

    // get a list of people following
    public BaseRequest getUserIDFollowing() {
        return Unirest.get(urlBase + "/user/{id}/following");
    }

    // Follow user
    public BaseRequest postUserIDFollowing() {
        return Unirest.post(urlBase + "/user/{id}/following");
    }

    // Unfollow user
    public BaseRequest deleteUserIDFollowing() {
        return Unirest.delete(urlBase + "/user/{id}/following");
    }

    // get a list of followers
    public BaseRequest getUserIDFollows() {
        return Unirest.get(urlBase + "/user/{id}/follows");
    }

    // Get a list of songs
    public BaseRequest getSong() {
        return Unirest.get(urlBase + "/song");
    }

    // Get song details
    public BaseRequest getSongID() {
        return Unirest.get(urlBase + "/song/{songid}");
    }

}
