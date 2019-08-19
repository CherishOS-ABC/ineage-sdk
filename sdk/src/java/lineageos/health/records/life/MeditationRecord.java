/*
 * Copyright (c) 2019, The LineageOS Project
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

package lineageos.health.records.life;

import lineageos.health.Record;

/**
 * Meditation time in minutes.
 *
 * <a href="https://en.wikipedia.org/wiki/Meditation">More info</a>
 */
public class MeditationRecord extends Record {
    public static final int CATEGORY = 300;

    public MeditationRecord(long time, long duration) {
        super(UNSET_UID, time, duration);
    }

    public MeditationRecord(long uid, long time, long duration) {
        super(uid, time, duration);
    }

    /** @hide */
    public MeditationRecord(byte[] bytes) {
        super(bytes);
    }

    @Override
    public int getCategory() {
        return CATEGORY;
    }

    @Override
    public String getSymbol() {
        return "min";
    }
}
