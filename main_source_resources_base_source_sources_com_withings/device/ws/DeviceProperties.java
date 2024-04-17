package com.withings.device.ws;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class DeviceProperties implements Serializable {
    @SerializedName("advertise_key")
    public String advertiseKey;
    public int batterylvl;
    public int behaviour;
    public Integer classification;
    @SerializedName("product_color")
    public String color;
    public int consumer;
    @SerializedName("custom_screens")
    public boolean customScreens;
    public int debug;
    @SerializedName("debugmask")
    public int debugMask;

    /* renamed from: fw  reason: collision with root package name */
    public String f37678fw;

    /* renamed from: id  reason: collision with root package name */
    public long f37679id;
    public int impedancemeter;
    @SerializedName("presence_sensitivity")
    public boolean isExtraSensitivityEnabled;
    @SerializedName("mic_mute")
    public boolean isMicMuted;
    public DateTime lastsessiondate;
    public DateTime lastweighindate;
    public double latitude;
    public Long linkid;
    public Long linkuserid;
    public double longitude;
    public String macaddress;
    @SerializedName("manual_geoloc")
    public String manualGeoloc;
    @SerializedName("measure_interval_time")
    public int measurementIntervalTime;
    public int mfgid;
    public int model;
    public DateTime modified;
    public int network;
    public List<Picture> pictures;
    public String preflang;

    /* renamed from: sn  reason: collision with root package name */
    public String f37680sn;
    public String timezone;
    public int type;
    @SerializedName("vu_meter")
    public Boolean vuMeter;

    /* loaded from: classes3.dex */
    public class Picture {
        public String size;
        public String uri;
        public String variant;

        public Picture() {
        }
    }
}
