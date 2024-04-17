package com.withings.library.healthscore.models.api;

import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
/* compiled from: VascularAgeMeasureGroup.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withings/library/healthscore/models/api/VascularAgeMeasureGroup;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "vascularAge", "", "(JI)V", "getDateInMillis", "()J", "getVascularAge", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VascularAgeMeasureGroup implements Measurement {
    private final long dateInMillis;
    private final int vascularAge;

    public VascularAgeMeasureGroup(long j5, int i11) {
        this.dateInMillis = j5;
        this.vascularAge = i11;
    }

    public static /* synthetic */ VascularAgeMeasureGroup copy$default(VascularAgeMeasureGroup vascularAgeMeasureGroup, long j5, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j5 = vascularAgeMeasureGroup.dateInMillis;
        }
        if ((i12 & 2) != 0) {
            i11 = vascularAgeMeasureGroup.vascularAge;
        }
        return vascularAgeMeasureGroup.copy(j5, i11);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final int component2() {
        return this.vascularAge;
    }

    public final VascularAgeMeasureGroup copy(long j5, int i11) {
        return new VascularAgeMeasureGroup(j5, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VascularAgeMeasureGroup)) {
            return false;
        }
        VascularAgeMeasureGroup vascularAgeMeasureGroup = (VascularAgeMeasureGroup) obj;
        if (this.dateInMillis == vascularAgeMeasureGroup.dateInMillis && this.vascularAge == vascularAgeMeasureGroup.vascularAge) {
            return true;
        }
        return false;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final int getVascularAge() {
        return this.vascularAge;
    }

    public int hashCode() {
        return Integer.hashCode(this.vascularAge) + (Long.hashCode(this.dateInMillis) * 31);
    }

    public String toString() {
        long j5 = this.dateInMillis;
        int i11 = this.vascularAge;
        return "VascularAgeMeasureGroup(dateInMillis=" + j5 + ", vascularAge=" + i11 + ")";
    }
}
