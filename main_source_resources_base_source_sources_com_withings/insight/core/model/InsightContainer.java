package com.withings.insight.core.model;

import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: InsightContainer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/withings/insight/core/model/InsightContainer;", "", InsightItemData.WS_TYPE, "Lcom/withings/insight/core/model/Insight;", "modified", "", "(Lcom/withings/insight/core/model/Insight;Ljava/lang/Long;)V", "getInsight", "()Lcom/withings/insight/core/model/Insight;", "getModified", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Lcom/withings/insight/core/model/Insight;Ljava/lang/Long;)Lcom/withings/insight/core/model/InsightContainer;", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsightContainer {
    @SerializedName(InsightItemData.WS_TYPE)
    private final Insight insight;
    private final Long modified;

    public InsightContainer(Insight insight, Long l5) {
        this.insight = insight;
        this.modified = l5;
    }

    public static /* synthetic */ InsightContainer copy$default(InsightContainer insightContainer, Insight insight, Long l5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            insight = insightContainer.insight;
        }
        if ((i11 & 2) != 0) {
            l5 = insightContainer.modified;
        }
        return insightContainer.copy(insight, l5);
    }

    public final Insight component1() {
        return this.insight;
    }

    public final Long component2() {
        return this.modified;
    }

    public final InsightContainer copy(Insight insight, Long l5) {
        return new InsightContainer(insight, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsightContainer)) {
            return false;
        }
        InsightContainer insightContainer = (InsightContainer) obj;
        if (u.e(this.insight, insightContainer.insight) && u.e(this.modified, insightContainer.modified)) {
            return true;
        }
        return false;
    }

    public final Insight getInsight() {
        return this.insight;
    }

    public final Long getModified() {
        return this.modified;
    }

    public int hashCode() {
        int hashCode;
        Insight insight = this.insight;
        int i11 = 0;
        if (insight == null) {
            hashCode = 0;
        } else {
            hashCode = insight.hashCode();
        }
        int i12 = hashCode * 31;
        Long l5 = this.modified;
        if (l5 != null) {
            i11 = l5.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Insight insight = this.insight;
        Long l5 = this.modified;
        return "InsightContainer(insight=" + insight + ", modified=" + l5 + ")";
    }

    public /* synthetic */ InsightContainer(Insight insight, Long l5, int i11, m mVar) {
        this(insight, (i11 & 2) != 0 ? null : l5);
    }
}
