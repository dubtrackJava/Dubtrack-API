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
package net.larry1123.dubtack.api.room;

import com.google.api.client.util.Key;
import net.larry1123.dubtack.api.users.UserData;

import java.util.List;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class RoomData {

    @Key("_id")
    String id;

    @Key
    UserData _user;

    @Key
    int activeUsers;

    @Key
    int allowedDjs;

    @Key
    BackgroundData background;

    @Key
    long created;

    @Key
    RoomCurrentSongData currentSong;

    @Key
    String description;

    @Key
    boolean displayQueue;

    @Key
    boolean isPublic;

    @Key
    String lang;

    @Key
    boolean lockQueue;

    @Key
    int maxLengthSong;

    // I'm just guessing this I think it would be a list of strings
    @Key
    List<String> musicType;

    @Key
    String name;

    @Key
    String otSession;

    // Unsure of the data type
    @Key
    Object password;

    @Key
    String realTimeChannel;

    @Key
    String roomEmbed;

    @Key
    String roomType;

    @Key
    String roomUrl;

    @Key
    int status;

    @Key
    long updated;

    @Key
    String userid;

    @Key
    String welcomeMessage;

    @Key
    boolean displayInLobby;

    @Key
    boolean displayInSearch;

    @Key
    boolean limitQueueLength;

    @Key
    int timeSongQueueRepeat;

    @Key
    boolean recycleDJ;

    @Key
    int maxSongQueueLength;

    @Key
    String roomDisplay;

    @Key
    String metaDescription;

    @Key
    boolean displayDJinQueue;

    @Key
    boolean displayUserJoin;

    @Key
    boolean displayUserLeave;

    @Key
    boolean displayUserGrab;

    @Key("__v")
    int version;

}
