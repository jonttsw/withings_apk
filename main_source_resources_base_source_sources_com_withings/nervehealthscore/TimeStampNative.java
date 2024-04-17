package com.withings.nervehealthscore;

import androidx.activity.b;
import androidx.appcompat.app.h;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: TimeStampNative.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\""}, d2 = {"Lcom/withings/nervehealthscore/TimeStampNative;", "", "dateTime", "Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "year", "", "month", FoodDayFragment.ARG_DAY, "hour", "minute", "second", "(IIIIII)V", "getDay", "()I", "getHour", "getMinute", "getMonth", "getSecond", "getYear", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toDateTime", "toString", "", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeStampNative {
    private final int day;
    private final int hour;
    private final int minute;
    private final int month;
    private final int second;
    private final int year;

    public TimeStampNative(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.year = i11;
        this.month = i12;
        this.day = i13;
        this.hour = i14;
        this.minute = i15;
        this.second = i16;
    }

    public static /* synthetic */ TimeStampNative copy$default(TimeStampNative timeStampNative, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = timeStampNative.year;
        }
        if ((i17 & 2) != 0) {
            i12 = timeStampNative.month;
        }
        int i18 = i12;
        if ((i17 & 4) != 0) {
            i13 = timeStampNative.day;
        }
        int i19 = i13;
        if ((i17 & 8) != 0) {
            i14 = timeStampNative.hour;
        }
        int i21 = i14;
        if ((i17 & 16) != 0) {
            i15 = timeStampNative.minute;
        }
        int i22 = i15;
        if ((i17 & 32) != 0) {
            i16 = timeStampNative.second;
        }
        return timeStampNative.copy(i11, i18, i19, i21, i22, i16);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.day;
    }

    public final int component4() {
        return this.hour;
    }

    public final int component5() {
        return this.minute;
    }

    public final int component6() {
        return this.second;
    }

    public final TimeStampNative copy(int i11, int i12, int i13, int i14, int i15, int i16) {
        return new TimeStampNative(i11, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeStampNative)) {
            return false;
        }
        TimeStampNative timeStampNative = (TimeStampNative) obj;
        if (this.year == timeStampNative.year && this.month == timeStampNative.month && this.day == timeStampNative.day && this.hour == timeStampNative.hour && this.minute == timeStampNative.minute && this.second == timeStampNative.second) {
            return true;
        }
        return false;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Integer.hashCode(this.second) + h.a(this.minute, h.a(this.hour, h.a(this.day, h.a(this.month, Integer.hashCode(this.year) * 31, 31), 31), 31), 31);
    }

    public final DateTime toDateTime() {
        return new DateTime(this.year, this.month, this.day, this.hour, this.minute, this.second);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TimeStampNative(year=");
        sb2.append(this.year);
        sb2.append(", month=");
        sb2.append(this.month);
        sb2.append(", day=");
        sb2.append(this.day);
        sb2.append(", hour=");
        sb2.append(this.hour);
        sb2.append(", minute=");
        sb2.append(this.minute);
        sb2.append(", second=");
        return b.c(sb2, this.second, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeStampNative(DateTime dateTime) {
        this(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth(), dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), dateTime.getSecondOfMinute());
        u.j(dateTime, "dateTime");
    }
}
