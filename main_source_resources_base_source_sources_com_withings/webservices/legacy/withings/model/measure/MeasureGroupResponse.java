package com.withings.webservices.legacy.withings.model.measure;
/* loaded from: classes4.dex */
public class MeasureGroupResponse {
    public final boolean deleted;
    public final boolean hasMore;
    public final WsMeasureGroup[] list;
    public final long updateTime;

    /* loaded from: classes4.dex */
    public static class WsMeasure {
        public final int type;
        public final int unit;
        public final double value;

        public WsMeasure(int i11, int i12, double d11) {
            this.type = i11;
            this.unit = i12;
            this.value = d11;
        }
    }

    /* loaded from: classes4.dex */
    public static class WsMeasureGroup {
        public final int attrib;
        public final int category;
        public final String comment;
        public final long date;
        public final boolean deleted;
        public final long grpid;
        public final WsMeasure[] measures;
        public final long modified;

        public WsMeasureGroup(long j5, int i11, long j11, long j12, int i12, String str, boolean z5, WsMeasure[] wsMeasureArr) {
            this.grpid = j5;
            this.attrib = i11;
            this.date = j11;
            this.modified = j12;
            this.category = i12;
            this.comment = str;
            this.deleted = z5;
            this.measures = wsMeasureArr;
        }
    }

    public MeasureGroupResponse(long j5, boolean z5, WsMeasureGroup[] wsMeasureGroupArr) {
        this.deleted = false;
        this.updateTime = j5;
        this.hasMore = z5;
        this.list = wsMeasureGroupArr;
    }

    public MeasureGroupResponse() {
        this.deleted = true;
        this.updateTime = 0L;
        this.hasMore = true;
        this.list = null;
    }
}
