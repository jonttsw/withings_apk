package com.withings.webservices.legacy.lastupdate;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class DeviceLastUpdate {
    private long deviceId;
    private DateTime modified = new DateTime(0);
    private Map<String, DateTime> measuresHf = new HashMap();
    private Map<String, DateTime> activity = new HashMap();
    private DateTime deviceScreens = new DateTime(0);
    private DateTime deviceScreensContents = new DateTime(0);
    private DateTime feature = new DateTime(0);

    public DeviceLastUpdate(long j5) {
        this.deviceId = j5;
    }

    public DateTime getActivityForDeviceType(int i11) {
        DateTime dateTime = this.activity.get(String.valueOf(i11));
        if (dateTime == null) {
            return new DateTime(0L);
        }
        return dateTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public DateTime getDeviceScreens() {
        return this.deviceScreens;
    }

    public DateTime getDeviceScreensContents() {
        return this.deviceScreensContents;
    }

    public DateTime getFeature() {
        return this.feature;
    }

    public DateTime getMeasuresHfForMeasureType(int i11) {
        DateTime dateTime = this.measuresHf.get(String.valueOf(i11));
        if (dateTime == null) {
            return new DateTime(0L);
        }
        return dateTime;
    }

    public DateTime getModified() {
        return this.modified;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActivity(Map<String, DateTime> map) {
        this.activity = map;
    }

    void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public void setDeviceScreens(DateTime dateTime) {
        this.deviceScreens = dateTime;
    }

    public void setDeviceScreensContents(DateTime dateTime) {
        this.deviceScreensContents = dateTime;
    }

    public void setFeature(DateTime dateTime) {
        this.feature = dateTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMeasuresHf(Map<String, DateTime> map) {
        this.measuresHf = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setModified(DateTime dateTime) {
        this.modified = dateTime;
    }
}
