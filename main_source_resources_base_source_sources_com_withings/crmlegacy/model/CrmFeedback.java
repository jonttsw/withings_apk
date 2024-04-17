package com.withings.crmlegacy.model;

import com.google.gson.JsonObject;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class CrmFeedback {
    private static final String KEY_EPOCH = "epoch";
    private static final String KEY_EVENT = "crmevent";
    private static final String KEY_ID = "crmid";
    private static final String KEY_USERID = "userid";
    private String crmId;
    private DateTime epoch;
    private String event;

    /* renamed from: id  reason: collision with root package name */
    private Long f35404id;
    private boolean sent;
    private long userId;

    public String getCrmId() {
        return this.crmId;
    }

    public DateTime getEpoch() {
        return this.epoch;
    }

    public String getEvent() {
        return this.event;
    }

    public Long getId() {
        return this.f35404id;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isSent() {
        return this.sent;
    }

    public void setCrmId(String str) {
        this.crmId = str;
    }

    public void setEpoch(DateTime dateTime) {
        this.epoch = dateTime;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setId(long j5) {
        this.f35404id = Long.valueOf(j5);
    }

    public void setSent(boolean z5) {
        this.sent = z5;
    }

    public void setUserId(long j5) {
        this.userId = j5;
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userid", Long.valueOf(this.userId));
        jsonObject.addProperty(KEY_EVENT, this.event);
        jsonObject.addProperty(KEY_ID, this.crmId);
        jsonObject.addProperty(KEY_EPOCH, Long.valueOf(this.epoch.getMillis() / 1000));
        return jsonObject;
    }
}
