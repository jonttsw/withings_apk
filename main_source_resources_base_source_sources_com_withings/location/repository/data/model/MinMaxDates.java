package com.withings.location.repository.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: MinMaxDates.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/withings/location/repository/data/model/MinMaxDates;", "", "minValue", "", "maxValue", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getMaxValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMinValue", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/withings/location/repository/data/model/MinMaxDates;", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MinMaxDates {
    private final Long maxValue;
    private final Long minValue;

    public MinMaxDates(Long l5, Long l6) {
        this.minValue = l5;
        this.maxValue = l6;
    }

    public static /* synthetic */ MinMaxDates copy$default(MinMaxDates minMaxDates, Long l5, Long l6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l5 = minMaxDates.minValue;
        }
        if ((i11 & 2) != 0) {
            l6 = minMaxDates.maxValue;
        }
        return minMaxDates.copy(l5, l6);
    }

    public final Long component1() {
        return this.minValue;
    }

    public final Long component2() {
        return this.maxValue;
    }

    public final MinMaxDates copy(Long l5, Long l6) {
        return new MinMaxDates(l5, l6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinMaxDates)) {
            return false;
        }
        MinMaxDates minMaxDates = (MinMaxDates) obj;
        if (u.e(this.minValue, minMaxDates.minValue) && u.e(this.maxValue, minMaxDates.maxValue)) {
            return true;
        }
        return false;
    }

    public final Long getMaxValue() {
        return this.maxValue;
    }

    public final Long getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        int hashCode;
        Long l5 = this.minValue;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = hashCode * 31;
        Long l6 = this.maxValue;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        Long l5 = this.minValue;
        Long l6 = this.maxValue;
        return "MinMaxDates(minValue=" + l5 + ", maxValue=" + l6 + ")";
    }
}
