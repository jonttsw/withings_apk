package com.withings.library.healthscore.models.api;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.v;
import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WeightMeasureGroup.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "weight", "", "fatMass", "(JDLjava/lang/Double;)V", "getDateInMillis", "()J", "getFatMass", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWeight", "()D", "component1", "component2", "component3", "copy", "(JDLjava/lang/Double;)Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "equals", "", "other", "", "hashCode", "", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeightMeasureGroup implements Measurement {
    private final long dateInMillis;
    private final Double fatMass;
    private final double weight;

    public WeightMeasureGroup(long j5, double d11, Double d12) {
        this.dateInMillis = j5;
        this.weight = d11;
        this.fatMass = d12;
    }

    public static /* synthetic */ WeightMeasureGroup copy$default(WeightMeasureGroup weightMeasureGroup, long j5, double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = weightMeasureGroup.dateInMillis;
        }
        long j11 = j5;
        if ((i11 & 2) != 0) {
            d11 = weightMeasureGroup.weight;
        }
        double d13 = d11;
        if ((i11 & 4) != 0) {
            d12 = weightMeasureGroup.fatMass;
        }
        return weightMeasureGroup.copy(j11, d13, d12);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final double component2() {
        return this.weight;
    }

    public final Double component3() {
        return this.fatMass;
    }

    public final WeightMeasureGroup copy(long j5, double d11, Double d12) {
        return new WeightMeasureGroup(j5, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeightMeasureGroup)) {
            return false;
        }
        WeightMeasureGroup weightMeasureGroup = (WeightMeasureGroup) obj;
        if (this.dateInMillis == weightMeasureGroup.dateInMillis && Double.compare(this.weight, weightMeasureGroup.weight) == 0 && u.e(this.fatMass, weightMeasureGroup.fatMass)) {
            return true;
        }
        return false;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final Double getFatMass() {
        return this.fatMass;
    }

    public final double getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int a11 = l0.a(this.weight, Long.hashCode(this.dateInMillis) * 31, 31);
        Double d11 = this.fatMass;
        if (d11 == null) {
            hashCode = 0;
        } else {
            hashCode = d11.hashCode();
        }
        return a11 + hashCode;
    }

    public String toString() {
        long j5 = this.dateInMillis;
        double d11 = this.weight;
        Double d12 = this.fatMass;
        StringBuilder e11 = v.e("WeightMeasureGroup(dateInMillis=", j5, ", weight=");
        e11.append(d11);
        e11.append(", fatMass=");
        e11.append(d12);
        e11.append(")");
        return e11.toString();
    }
}
