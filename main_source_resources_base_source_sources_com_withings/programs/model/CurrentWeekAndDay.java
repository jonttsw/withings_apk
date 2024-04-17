package com.withings.programs.model;

import androidx.appcompat.app.h;
import kotlin.Metadata;
/* compiled from: CurrentWeekAndDay.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/programs/model/CurrentWeekAndDay;", "", "dayIndex", "", "weekIndex", "(II)V", "getDayIndex", "()I", "getWeekIndex", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CurrentWeekAndDay {
    private final int dayIndex;
    private final int weekIndex;

    public CurrentWeekAndDay(int i11, int i12) {
        this.dayIndex = i11;
        this.weekIndex = i12;
    }

    public static /* synthetic */ CurrentWeekAndDay copy$default(CurrentWeekAndDay currentWeekAndDay, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = currentWeekAndDay.dayIndex;
        }
        if ((i13 & 2) != 0) {
            i12 = currentWeekAndDay.weekIndex;
        }
        return currentWeekAndDay.copy(i11, i12);
    }

    public final int component1() {
        return this.dayIndex;
    }

    public final int component2() {
        return this.weekIndex;
    }

    public final CurrentWeekAndDay copy(int i11, int i12) {
        return new CurrentWeekAndDay(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentWeekAndDay)) {
            return false;
        }
        CurrentWeekAndDay currentWeekAndDay = (CurrentWeekAndDay) obj;
        if (this.dayIndex == currentWeekAndDay.dayIndex && this.weekIndex == currentWeekAndDay.weekIndex) {
            return true;
        }
        return false;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final int getWeekIndex() {
        return this.weekIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.weekIndex) + (Integer.hashCode(this.dayIndex) * 31);
    }

    public String toString() {
        return h.c("CurrentWeekAndDay(dayIndex=", this.dayIndex, ", weekIndex=", this.weekIndex, ")");
    }
}
