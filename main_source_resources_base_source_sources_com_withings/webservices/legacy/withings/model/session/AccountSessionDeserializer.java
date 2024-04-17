package com.withings.webservices.legacy.withings.model.session;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class AccountSessionDeserializer implements JsonDeserializer<AccountSession> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public AccountSession deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String r02 = v1.r0(jsonElement, ConstantsWs.JSON_SESSION_KEY_SESSIONID, null);
        long p02 = v1.p0(jsonElement, "account.id", Long.MIN_VALUE);
        if (p02 == Long.MIN_VALUE) {
            p02 = v1.p0(jsonElement, "accountid", Long.MIN_VALUE);
        }
        long j5 = p02;
        if (r02 == null || j5 == Long.MIN_VALUE) {
            return null;
        }
        String r03 = v1.r0(jsonElement, "auth_token", null);
        String r04 = v1.r0(jsonElement, "providertoken", null);
        if (r04 == null) {
            r04 = v1.r0(jsonElement, "token", null);
        }
        AccountSession accountSession = new AccountSession(r02, System.currentTimeMillis(), 900000L, j5, "", r03, r04);
        accountSession.setFqa("t".equals(v1.r0(jsonElement, "account.is_fqa", null)));
        accountSession.setSecureSessionRequired(v1.m0(jsonElement, "require_secure_session"));
        accountSession.setSecure(v1.m0(jsonElement, "is_secure"));
        return accountSession;
    }
}
