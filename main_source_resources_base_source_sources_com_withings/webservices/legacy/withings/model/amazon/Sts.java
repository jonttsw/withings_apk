package com.withings.webservices.legacy.withings.model.amazon;

import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class Sts {
    private List<String> buckets;
    private DateTime expiretime;
    private List<BucketInfo> groupsts;
    private String region;

    /* loaded from: classes4.dex */
    public class Response {
        private Sts sts;

        public Response() {
        }

        public Sts getSts() {
            return this.sts;
        }

        public void setSts(Sts sts) {
            this.sts = sts;
        }
    }

    public List<String> getBuckets() {
        return this.buckets;
    }

    public DateTime getExpiretime() {
        return this.expiretime;
    }

    public List<BucketInfo> getGroupsts() {
        return this.groupsts;
    }

    public String getRegion() {
        return this.region;
    }

    public void setBucket(List<String> list) {
        this.buckets = list;
    }

    public void setExpiretime(DateTime dateTime) {
        this.expiretime = dateTime;
    }

    public void setGroupsts(List<BucketInfo> list) {
        this.groupsts = list;
    }

    public void setRegion(String str) {
        this.region = str;
    }
}
