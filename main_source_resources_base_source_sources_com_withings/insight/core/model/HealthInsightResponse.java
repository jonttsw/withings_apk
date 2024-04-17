package com.withings.insight.core.model;

import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HealthInsightWS.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/insight/core/model/HealthInsightResponse;", "", ConstantsWs.CHANNEL_PUSH_INSIGHTS, "", "Lcom/withings/insight/core/model/HealthInsightWS;", "modified", "", "(Ljava/util/List;J)V", "getInsights", "()Ljava/util/List;", "getModified", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthInsightResponse {
    @SerializedName(ConstantsWs.CHANNEL_PUSH_INSIGHTS)
    private final List<HealthInsightWS> insights;
    @SerializedName("modified")
    private final long modified;

    public HealthInsightResponse(List<HealthInsightWS> insights, long j5) {
        u.j(insights, "insights");
        this.insights = insights;
        this.modified = j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthInsightResponse copy$default(HealthInsightResponse healthInsightResponse, List list, long j5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = healthInsightResponse.insights;
        }
        if ((i11 & 2) != 0) {
            j5 = healthInsightResponse.modified;
        }
        return healthInsightResponse.copy(list, j5);
    }

    public final List<HealthInsightWS> component1() {
        return this.insights;
    }

    public final long component2() {
        return this.modified;
    }

    public final HealthInsightResponse copy(List<HealthInsightWS> insights, long j5) {
        u.j(insights, "insights");
        return new HealthInsightResponse(insights, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthInsightResponse)) {
            return false;
        }
        HealthInsightResponse healthInsightResponse = (HealthInsightResponse) obj;
        if (u.e(this.insights, healthInsightResponse.insights) && this.modified == healthInsightResponse.modified) {
            return true;
        }
        return false;
    }

    public final List<HealthInsightWS> getInsights() {
        return this.insights;
    }

    public final long getModified() {
        return this.modified;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + (this.insights.hashCode() * 31);
    }

    public String toString() {
        List<HealthInsightWS> list = this.insights;
        long j5 = this.modified;
        return "HealthInsightResponse(insights=" + list + ", modified=" + j5 + ")";
    }
}
