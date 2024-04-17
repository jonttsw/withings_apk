package com.withings.library.measure.ws;

import com.withings.library.measure.ws.MeasureGroupResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BatchStoreMeasureResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/library/measure/ws/BatchStoreMeasureResponse;", "", "updatetime", "", "measuregrps", "", "Lcom/withings/library/measure/ws/MeasureGroupResponse$WsMeasureGroup;", "(JLjava/util/List;)V", "getMeasuregrps", "()Ljava/util/List;", "getUpdatetime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "library_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BatchStoreMeasureResponse {
    public static final int $stable = 8;
    private final List<MeasureGroupResponse.WsMeasureGroup> measuregrps;
    private final long updatetime;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchStoreMeasureResponse(long j5, List<? extends MeasureGroupResponse.WsMeasureGroup> measuregrps) {
        u.j(measuregrps, "measuregrps");
        this.updatetime = j5;
        this.measuregrps = measuregrps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchStoreMeasureResponse copy$default(BatchStoreMeasureResponse batchStoreMeasureResponse, long j5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = batchStoreMeasureResponse.updatetime;
        }
        if ((i11 & 2) != 0) {
            list = batchStoreMeasureResponse.measuregrps;
        }
        return batchStoreMeasureResponse.copy(j5, list);
    }

    public final long component1() {
        return this.updatetime;
    }

    public final List<MeasureGroupResponse.WsMeasureGroup> component2() {
        return this.measuregrps;
    }

    public final BatchStoreMeasureResponse copy(long j5, List<? extends MeasureGroupResponse.WsMeasureGroup> measuregrps) {
        u.j(measuregrps, "measuregrps");
        return new BatchStoreMeasureResponse(j5, measuregrps);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchStoreMeasureResponse)) {
            return false;
        }
        BatchStoreMeasureResponse batchStoreMeasureResponse = (BatchStoreMeasureResponse) obj;
        if (this.updatetime == batchStoreMeasureResponse.updatetime && u.e(this.measuregrps, batchStoreMeasureResponse.measuregrps)) {
            return true;
        }
        return false;
    }

    public final List<MeasureGroupResponse.WsMeasureGroup> getMeasuregrps() {
        return this.measuregrps;
    }

    public final long getUpdatetime() {
        return this.updatetime;
    }

    public int hashCode() {
        return this.measuregrps.hashCode() + (Long.hashCode(this.updatetime) * 31);
    }

    public String toString() {
        long j5 = this.updatetime;
        List<MeasureGroupResponse.WsMeasureGroup> list = this.measuregrps;
        return "BatchStoreMeasureResponse(updatetime=" + j5 + ", measuregrps=" + list + ")";
    }
}
