package com.withings.library.healthscore.models.api;

import androidx.camera.core.v;
import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
/* compiled from: HeightMeasureGroup.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/withings/library/healthscore/models/api/HeightMeasureGroup;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "heightInMeter", "", "(JD)V", "getDateInMillis", "()J", "getHeightInMeter", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HeightMeasureGroup implements Measurement {
    private final long dateInMillis;
    private final double heightInMeter;

    public HeightMeasureGroup(long j5, double d11) {
        this.dateInMillis = j5;
        this.heightInMeter = d11;
    }

    public static /* synthetic */ HeightMeasureGroup copy$default(HeightMeasureGroup heightMeasureGroup, long j5, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = heightMeasureGroup.dateInMillis;
        }
        if ((i11 & 2) != 0) {
            d11 = heightMeasureGroup.heightInMeter;
        }
        return heightMeasureGroup.copy(j5, d11);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final double component2() {
        return this.heightInMeter;
    }

    public final HeightMeasureGroup copy(long j5, double d11) {
        return new HeightMeasureGroup(j5, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeightMeasureGroup)) {
            return false;
        }
        HeightMeasureGroup heightMeasureGroup = (HeightMeasureGroup) obj;
        if (this.dateInMillis == heightMeasureGroup.dateInMillis && Double.compare(this.heightInMeter, heightMeasureGroup.heightInMeter) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final double getHeightInMeter() {
        return this.heightInMeter;
    }

    public int hashCode() {
        return Double.hashCode(this.heightInMeter) + (Long.hashCode(this.dateInMillis) * 31);
    }

    public String toString() {
        long j5 = this.dateInMillis;
        double d11 = this.heightInMeter;
        StringBuilder e11 = v.e("HeightMeasureGroup(dateInMillis=", j5, ", heightInMeter=");
        e11.append(d11);
        e11.append(")");
        return e11.toString();
    }
}
