package com.withings.webservices.legacy.withings.model.timeline;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class WsTimelineItem {
    private JsonObject data;
    @SerializedName("deviceid")
    private long deviceId;
    @SerializedName("expiration")
    private DateTime expirationDate;
    @SerializedName("section_tags")
    private String[] sectionTags;
    @SerializedName("epoch")
    private DateTime timestamp;
    private long ttl;
    @SerializedName("class")
    private String type;
    @SerializedName("itemid")
    private Long wsId;

    public JsonObject getData() {
        return this.data;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public DateTime getExpirationDate() {
        return this.expirationDate;
    }

    public String[] getSectionTags() {
        return this.sectionTags;
    }

    public DateTime getTimestamp() {
        return this.timestamp;
    }

    public long getTtl() {
        return this.ttl;
    }

    public String getType() {
        return this.type;
    }

    public Long getWsId() {
        return this.wsId;
    }

    public void setData(JsonObject jsonObject) {
        this.data = jsonObject;
    }

    public void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public void setExpirationDate(DateTime dateTime) {
        this.expirationDate = dateTime;
    }

    public void setSectionTags(String[] strArr) {
        this.sectionTags = strArr;
    }

    public void setTimestamp(DateTime dateTime) {
        this.timestamp = dateTime;
    }

    public void setTtl(long j5) {
        this.ttl = j5;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWsId(Long l5) {
        this.wsId = l5;
    }
}
