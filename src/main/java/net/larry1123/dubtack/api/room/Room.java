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

import net.larry1123.dubtack.api.users.User;

import java.util.Locale;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public interface Room {

    String getRoomId();

    User getRoomOwner();

    int getActiveUsers();

    int getAllowedDjs();

    Background getBackground();

    long getCreated();

    // CurrentSong
    String getDescription();

    boolean getDisplayQueue();

    boolean isPublic();

    // I'm just guessing that it would be a Locale it's null for NB's room
    Locale getLang();

    int getMaxLengthSong();

    // Iterable<MusicType> getMusicType() I think that this is what it would be
    String getName();

    String getOtSession();

    String getPassword();

    String getRealTimeChannel();

    String getRoomEmbed();

    RoomType getRoomTime();

    // truly it's a part of the URI but let's not get too picky
    String getRoomUrl();

    int getStatus();

    long getUpdated();

    String getRoomOwnerId();

    boolean isLockQueue();

    String getWelcomeMessage();

    boolean isDisplayedInLobby();

    boolean isDisplayedInSearch();

    boolean isQueueLengthLimited();

    int getSongQueueRepeatTime();

    boolean getRecycleDj();

    int getMaxSongQueueLenght();

    // TODO RoomDisplay enum
    String getRoomDisplay();

    String getMetaDescription();

    boolean doesDisplayDjInQueue();

    boolean doesDisplayUserJoin();

    boolean doesDisplayUserLeave();

    boolean doesDisplayUserGrab();

    // TODO maybe this is a thing we will have here

    Iterable<User> getUsers();
    // void leaveRoom();

}
