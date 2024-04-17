package com.withings.webservices.legacy.withings.model.session;
/* loaded from: classes4.dex */
public class Session {
    private static final long TIME_TO_LIVE = 40000;
    public long mCreationTime;
    public final String mSessionId;
    public long mTimeToLive;

    public Session(String str, long j5, long j11) {
        this.mSessionId = str;
        this.mCreationTime = j5;
        this.mTimeToLive = j11;
    }

    public long getCreationTime() {
        return this.mCreationTime;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public long getTimeToLive() {
        return this.mTimeToLive;
    }

    public boolean isStillValid() {
        if ((this.mCreationTime + this.mTimeToLive) - TIME_TO_LIVE > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public void setCreationTime(long j5) {
        this.mCreationTime = j5;
    }

    public void setTimeToLive(long j5) {
        this.mTimeToLive = j5;
    }

    public Session(String str, long j5) {
        this.mSessionId = str;
        this.mCreationTime = System.currentTimeMillis();
        this.mTimeToLive = j5;
    }
}
