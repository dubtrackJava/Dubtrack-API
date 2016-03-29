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
package net.larry1123.dubtack.api.users;

import com.google.api.client.util.Key;

import java.net.URL;
import java.util.List;

/**
 * @author Larry1123
 * @since 0.1.0
 */
public class ProfileImageData {

    @Key("public_id")
    String publicId;

    @Key
    int version;

    @Key
    int width;

    @Key
    int heigth;

    @Key
    String format;

    @Key("resource_type")
    String resourceType;

    @Key
    List<String> tags;

    @Key
    int bytes;

    @Key("etag")
    String eTag;

    @Key
    URL url;

    @Key("secure_url")
    URL secureUrl;

}
