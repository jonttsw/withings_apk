package com.withings.device.ws;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* loaded from: classes3.dex */
public class DeviceSettings {
    @SerializedName("byaccount")
    public List<ByAccountSettings> accountSettings;
    @SerializedName("bydevice")
    public List<ByDeviceSettings> deviceSettings;
}
