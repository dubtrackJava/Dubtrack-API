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

import net.larry1123.dubtack.api.Updateable;
import net.larry1123.dubtack.api.role.Role;
import net.larry1123.dubtack.api.users.User;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public interface RoomUser extends Updateable {

    String getId();

    int getPlayedCount();

    int SongsInQueue();

    boolean isActive();

    int getDubs();

    int getOrder();

    String getRoomId();

    String getUserId();

    boolean isAuthorized();

    String getOtToken();

    int getQueuePaused();

    // Called Role ID idk why
    Role getRole();

    boolean isBanned();

    long getBannedTime();

    long getBannedUntil();

    int getKickCount();

    long getKickTime();

    boolean isMuted();

    int getSkippedCount();

    int getSongsInQueue();

    //

    User getUser();

}
