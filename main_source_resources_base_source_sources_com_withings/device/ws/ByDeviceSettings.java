package com.withings.device.ws;

import com.google.gson.annotations.SerializedName;
/* loaded from: classes3.dex */
public class ByDeviceSettings {
    public boolean babyphone;
    public long created;
    @SerializedName("deviceid")
    public long deviceId;
    public long modified;
    @SerializedName("movement_th")
    public int movementThreshold;
    @SerializedName("night_vision")
    public String nightVision;
    @SerializedName("noise_th")
    public int noiseThreshold;
    public boolean recording;
    @SerializedName("visual_notif_online")
    public boolean visualNotifOnline;
    @SerializedName("visual_notif_voc")
    public boolean visualNotifVoc;
    @SerializedName("voc_th")
    public int vocThreshold;
}
