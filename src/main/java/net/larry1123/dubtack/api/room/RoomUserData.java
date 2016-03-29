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
import net.larry1123.dubtack.api.role.RoleData;
import net.larry1123.dubtack.api.users.UserData;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class RoomUserData {

    @Key("_id")
    String id;

    @Key
    long updated;

    @Key
    int playedCount;

    @Key
    int songsInQueue;

    @Key
    boolean active;

    @Key
    int dubs;

    @Key
    int order;

    @Key
    String roomid;

    @Key
    String userid;

    UserData _user;

    @Key
    boolean authorized;

    @Key("ot_token")
    String otToken;

    @Key
    boolean queuePaused;

    // Called Role ID idk why
    @Key("roleid")
    RoleData role;

    @Key
    boolean banned;

    @Key
    long bannedTime;

    @Key
    long bannedUntil;

    @Key
    int kickCount;

    @Key
    long kickTime;

    @Key
    boolean muted;

    @Key
    int skippedCount;

    @Key
    int waitLine;

    @Key("__v")
    int version;

}
