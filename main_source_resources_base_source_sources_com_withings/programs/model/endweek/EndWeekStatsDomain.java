package com.withings.programs.model.endweek;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EndWeekStatsDomain.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekStatsDomain;", "", "type", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "totalTask", "", "totalTaskCompleted", "(Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;II)V", "getTotalTask", "()I", "getTotalTaskCompleted", "getType", "()Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EndWeekStatsDomain {
    private final int totalTask;
    private final int totalTaskCompleted;
    private final EndWeekTaskTypeDomain type;

    public EndWeekStatsDomain(EndWeekTaskTypeDomain type, int i11, int i12) {
        u.j(type, "type");
        this.type = type;
        this.totalTask = i11;
        this.totalTaskCompleted = i12;
    }

    public static /* synthetic */ EndWeekStatsDomain copy$default(EndWeekStatsDomain endWeekStatsDomain, EndWeekTaskTypeDomain endWeekTaskTypeDomain, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            endWeekTaskTypeDomain = endWeekStatsDomain.type;
        }
        if ((i13 & 2) != 0) {
            i11 = endWeekStatsDomain.totalTask;
        }
        if ((i13 & 4) != 0) {
            i12 = endWeekStatsDomain.totalTaskCompleted;
        }
        return endWeekStatsDomain.copy(endWeekTaskTypeDomain, i11, i12);
    }

    public final EndWeekTaskTypeDomain component1() {
        return this.type;
    }

    public final int component2() {
        return this.totalTask;
    }

    public final int component3() {
        return this.totalTaskCompleted;
    }

    public final EndWeekStatsDomain copy(EndWeekTaskTypeDomain type, int i11, int i12) {
        u.j(type, "type");
        return new EndWeekStatsDomain(type, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndWeekStatsDomain)) {
            return false;
        }
        EndWeekStatsDomain endWeekStatsDomain = (EndWeekStatsDomain) obj;
        if (u.e(this.type, endWeekStatsDomain.type) && this.totalTask == endWeekStatsDomain.totalTask && this.totalTaskCompleted == endWeekStatsDomain.totalTaskCompleted) {
            return true;
        }
        return false;
    }

    public final int getTotalTask() {
        return this.totalTask;
    }

    public final int getTotalTaskCompleted() {
        return this.totalTaskCompleted;
    }

    public final EndWeekTaskTypeDomain getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalTaskCompleted) + h.a(this.totalTask, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        EndWeekTaskTypeDomain endWeekTaskTypeDomain = this.type;
        int i11 = this.totalTask;
        int i12 = this.totalTaskCompleted;
        StringBuilder sb2 = new StringBuilder("EndWeekStatsDomain(type=");
        sb2.append(endWeekTaskTypeDomain);
        sb2.append(", totalTask=");
        sb2.append(i11);
        sb2.append(", totalTaskCompleted=");
        return e.c(sb2, i12, ")");
    }
}
