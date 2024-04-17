package com.withings.webservices.legacy.withings.model.session;

import androidx.camera.camera2.internal.v1;
import androidx.camera.core.y1;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.push.constant.RemoteMessageConst;
/* loaded from: classes4.dex */
public class DeviceSession extends Session {
    public static final long DEVICE_SESSION_TTL = 600000;
    public long deviceId;
    public String json;
    public String mac;

    public DeviceSession(String str, long j5, String str2, String str3) {
        this(str, j5, str2, str3, 0L);
    }

    public String getColor() {
        try {
            JsonElement parse = new JsonParser().parse(this.json);
            String r02 = v1.r0(parse, RemoteMessageConst.Notification.COLOR, null);
            if (r02 != null) {
                return r02;
            }
            return v1.r0(parse, "device.color", null);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public Integer getConsumer() {
        try {
            return Integer.valueOf(v1.o0(-1, "ind.csm", new JsonParser().parse(this.json)));
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public int getDebugMask() {
        try {
            return v1.o0(-1, "ind.stp", new JsonParser().parse(this.json));
        } catch (JsonSyntaxException unused) {
            return -1;
        }
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getJSonWithStatus0() {
        return y1.e(new StringBuilder("{\"status\":0,\"body\":"), this.json, "}");
    }

    public String getJson() {
        return this.json;
    }

    public String getMac() {
        return this.mac;
    }

    public String getUpgradeUrl() {
        try {
            return v1.r0(new JsonParser().parse(this.json), "syp.blc", null);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public void setJson(String str) {
        this.json = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("mac : ");
        sb2.append(this.mac);
        sb2.append(" | sessionId : ");
        sb2.append(this.mSessionId);
        sb2.append(" | usersJson : ");
        return y1.e(sb2, this.json, " | ");
    }

    public DeviceSession(String str, long j5, String str2, String str3, long j11) {
        super(str, j5);
        this.mac = str2;
        this.json = str3;
        this.deviceId = j11;
    }

    /* renamed from: clone */
    public DeviceSession m37clone() {
        return new DeviceSession(this.mSessionId, this.mTimeToLive, this.mac, this.json, this.deviceId);
    }
}
