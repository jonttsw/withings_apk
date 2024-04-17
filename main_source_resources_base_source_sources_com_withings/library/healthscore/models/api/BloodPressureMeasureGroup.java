package com.withings.library.healthscore.models.api;

import androidx.appcompat.app.h;
import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
/* compiled from: BloodPressureMeasureGroup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "systole", "", "diastole", "(JII)V", "getDateInMillis", "()J", "getDiastole", "()I", "getSystole", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BloodPressureMeasureGroup implements Measurement {
    private final long dateInMillis;
    private final int diastole;
    private final int systole;

    public BloodPressureMeasureGroup(long j5, int i11, int i12) {
        this.dateInMillis = j5;
        this.systole = i11;
        this.diastole = i12;
    }

    public static /* synthetic */ BloodPressureMeasureGroup copy$default(BloodPressureMeasureGroup bloodPressureMeasureGroup, long j5, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j5 = bloodPressureMeasureGroup.dateInMillis;
        }
        if ((i13 & 2) != 0) {
            i11 = bloodPressureMeasureGroup.systole;
        }
        if ((i13 & 4) != 0) {
            i12 = bloodPressureMeasureGroup.diastole;
        }
        return bloodPressureMeasureGroup.copy(j5, i11, i12);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final int component2() {
        return this.systole;
    }

    public final int component3() {
        return this.diastole;
    }

    public final BloodPressureMeasureGroup copy(long j5, int i11, int i12) {
        return new BloodPressureMeasureGroup(j5, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BloodPressureMeasureGroup)) {
            return false;
        }
        BloodPressureMeasureGroup bloodPressureMeasureGroup = (BloodPressureMeasureGroup) obj;
        if (this.dateInMillis == bloodPressureMeasureGroup.dateInMillis && this.systole == bloodPressureMeasureGroup.systole && this.diastole == bloodPressureMeasureGroup.diastole) {
            return true;
        }
        return false;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final int getDiastole() {
        return this.diastole;
    }

    public final int getSystole() {
        return this.systole;
    }

    public int hashCode() {
        return Integer.hashCode(this.diastole) + h.a(this.systole, Long.hashCode(this.dateInMillis) * 31, 31);
    }

    public String toString() {
        long j5 = this.dateInMillis;
        int i11 = this.systole;
        int i12 = this.diastole;
        return "BloodPressureMeasureGroup(dateInMillis=" + j5 + ", systole=" + i11 + ", diastole=" + i12 + ")";
    }
}
