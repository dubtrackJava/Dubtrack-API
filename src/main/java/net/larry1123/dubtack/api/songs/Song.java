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
package net.larry1123.dubtack.api.songs;

import net.larry1123.dubtack.api.dub.Dubable;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public interface Song extends Dubable {

    String getName();

    String getDescription();

    SongImages getImages();

    String getGenre();

    SongType getType();

    String getFkid();

    String getStreamUrl();

    String getFileUrl();

    String getArtist();

    String getLength();

    String getBitrate();

    String getMeta();

    long getCreated();

    String getUserId();

    String getSongId();

}
