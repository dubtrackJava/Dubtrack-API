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
package net.larry1123.dubtack.api.queue;

import com.google.api.client.util.Key;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class SongMetaData {

    @Key
    String id;

    @Key
    long created;

    @Key
    boolean isActive;

    @Key
    boolean isPlayed;

    @Key
    boolean skipped;

    @Key
    int order;

    @Key("roomid")
    String roomId;

    @Key
    long songLength;

    @Key("updubs")
    int upDubs;

    @Key("downdubs")
    int downDubs;

    @Key("userid")
    String userId;

    @Key("songid")
    String songId;

    @Key("_user")
    String user;

    @Key("_song")
    String song;

    @Key
    long played;

    @Key
    int grabs;

    @Key("__v")
    int version;

}
