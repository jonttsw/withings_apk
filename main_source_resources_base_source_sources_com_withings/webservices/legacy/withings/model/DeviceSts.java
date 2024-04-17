package com.withings.webservices.legacy.withings.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* loaded from: classes4.dex */
public class DeviceSts {
    @SerializedName("accesskeyid")
    private String accessKeyId;
    @SerializedName("bucket_cvr")
    private String bucketCvr;
    @SerializedName("bucket_timeline")
    private String bucketTimeline;
    private List<String> buckets;
    @SerializedName("expiretime")
    private long expireTime;
    private String region;
    @SerializedName("secretaccesskey")
    private String secretAccessKey;
    @SerializedName("sessiontoken")
    private String sessionToken;
    public DeviceSts sts;

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    public DeviceSts getSts() {
        DeviceSts deviceSts = this.sts;
        if (deviceSts == null) {
            return this;
        }
        return deviceSts;
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() > getSts().expireTime * 1000) {
            return true;
        }
        return false;
    }

    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    public void setSecretAccessKey(String str) {
        this.secretAccessKey = str;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }
}
