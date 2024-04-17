package com.withings.webservices.legacy.withings.model.leaderboard;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class Invitation {
    public static final int TYPE_FRIENDSHIP = 1;
    public static final int TYPE_LEADERBOARD = 2;
    public static final int TYPE_PROGRAM = 3;
    private String mFirstName;
    private String mLastName;
    private long mSenderAccountId;

    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<Invitation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Invitation deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return new Invitation(v1.p0(jsonElement, "sender_accountid", 0L), v1.r0(jsonElement, "options.firstname", null), v1.r0(jsonElement, "options.lastname", null));
        }
    }

    public Invitation(long j5, String str, String str2) {
        this.mSenderAccountId = j5;
        this.mFirstName = str;
        this.mLastName = str2;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public long getSenderAccount() {
        return this.mSenderAccountId;
    }
}
