package com.withings.webservices.legacy.withings.model.session;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class DeviceSessionDeserializer implements JsonDeserializer<DeviceSession> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public DeviceSession deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String r02 = v1.r0(jsonElement, ConstantsWs.JSON_SESSION_KEY_SESSIONID, null);
        long p02 = v1.p0(jsonElement, "deviceid", Long.MIN_VALUE);
        if (r02 != null && p02 != Long.MIN_VALUE) {
            return new DeviceSession(r02, DeviceSession.DEVICE_SESSION_TTL, "", jsonElement.toString(), p02);
        }
        return new DeviceSession(r02, DeviceSession.DEVICE_SESSION_TTL, "", jsonElement.toString());
    }
}
