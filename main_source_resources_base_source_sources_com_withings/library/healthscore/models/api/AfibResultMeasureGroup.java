package com.withings.library.healthscore.models.api;

import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
/* compiled from: AfibResultMeasureGroup.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "isAFibDetected", "", "(JZ)V", "getDateInMillis", "()J", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AfibResultMeasureGroup implements Measurement {
    private final long dateInMillis;
    private final boolean isAFibDetected;

    public AfibResultMeasureGroup(long j5, boolean z5) {
        this.dateInMillis = j5;
        this.isAFibDetected = z5;
    }

    public static /* synthetic */ AfibResultMeasureGroup copy$default(AfibResultMeasureGroup afibResultMeasureGroup, long j5, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = afibResultMeasureGroup.dateInMillis;
        }
        if ((i11 & 2) != 0) {
            z5 = afibResultMeasureGroup.isAFibDetected;
        }
        return afibResultMeasureGroup.copy(j5, z5);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final boolean component2() {
        return this.isAFibDetected;
    }

    public final AfibResultMeasureGroup copy(long j5, boolean z5) {
        return new AfibResultMeasureGroup(j5, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfibResultMeasureGroup)) {
            return false;
        }
        AfibResultMeasureGroup afibResultMeasureGroup = (AfibResultMeasureGroup) obj;
        if (this.dateInMillis == afibResultMeasureGroup.dateInMillis && this.isAFibDetected == afibResultMeasureGroup.isAFibDetected) {
            return true;
        }
        return false;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Long.hashCode(this.dateInMillis) * 31;
        boolean z5 = this.isAFibDetected;
        int i11 = z5;
        if (z5 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isAFibDetected() {
        return this.isAFibDetected;
    }

    public String toString() {
        long j5 = this.dateInMillis;
        boolean z5 = this.isAFibDetected;
        return "AfibResultMeasureGroup(dateInMillis=" + j5 + ", isAFibDetected=" + z5 + ")";
    }
}
