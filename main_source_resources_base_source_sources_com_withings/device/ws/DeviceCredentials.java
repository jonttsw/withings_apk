package com.withings.device.ws;

import u70.i;
/* loaded from: classes3.dex */
public class DeviceCredentials {
    private long firmware;
    private i macAddress;
    private int mfgId;
    private String secret;

    public DeviceCredentials(i iVar, String str, long j5, int i11) {
        this.macAddress = iVar;
        this.secret = str;
        this.firmware = j5;
        this.mfgId = i11;
    }

    public long getFirmware() {
        return this.firmware;
    }

    public i getMacAddress() {
        return this.macAddress;
    }

    public int getMfgId() {
        return this.mfgId;
    }

    public String getSecret() {
        return this.secret;
    }
}
