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
package net.larry1123.dubtack.api.playlist;

import com.google.api.client.util.Key;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class PlaylistData {

    @Key("_id")
    String id;

    @Key
    String name;

    @Key
    int status;

    @Key
    boolean isPublic;

    @Key
    long created;

    @Key
    String type;

    @Key
    String fkid;

    @Key("userid")
    String userId;

    @Key
    int totalItems;

    @Key("__v")
    int version;

}
