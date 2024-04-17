package com.withings.weight.android.model;

import com.withings.contentproviders.eightfit.model.webservice.a;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformCompositionRange.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/withings/weight/android/model/ZoneRanges;", "", "lowest", "", "", ConstantsWs.BREATHING_DISTURBANCE_LOW, "middle", "high", "highest", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHigh", "()Ljava/util/List;", "getHighest", "getLow", "getLowest", "getMiddle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ZoneRanges {
    private final List<Double> high;
    private final List<Double> highest;
    private final List<Double> low;
    private final List<Double> lowest;
    private final List<Double> middle;

    public ZoneRanges(List<Double> lowest, List<Double> low, List<Double> middle, List<Double> high, List<Double> highest) {
        u.j(lowest, "lowest");
        u.j(low, "low");
        u.j(middle, "middle");
        u.j(high, "high");
        u.j(highest, "highest");
        this.lowest = lowest;
        this.low = low;
        this.middle = middle;
        this.high = high;
        this.highest = highest;
    }

    public static /* synthetic */ ZoneRanges copy$default(ZoneRanges zoneRanges, List list, List list2, List list3, List list4, List list5, int i11, Object obj) {
        List<Double> list6 = list;
        if ((i11 & 1) != 0) {
            list6 = zoneRanges.lowest;
        }
        List<Double> list7 = list2;
        if ((i11 & 2) != 0) {
            list7 = zoneRanges.low;
        }
        List list8 = list7;
        List<Double> list9 = list3;
        if ((i11 & 4) != 0) {
            list9 = zoneRanges.middle;
        }
        List list10 = list9;
        List<Double> list11 = list4;
        if ((i11 & 8) != 0) {
            list11 = zoneRanges.high;
        }
        List list12 = list11;
        List<Double> list13 = list5;
        if ((i11 & 16) != 0) {
            list13 = zoneRanges.highest;
        }
        return zoneRanges.copy(list6, list8, list10, list12, list13);
    }

    public final List<Double> component1() {
        return this.lowest;
    }

    public final List<Double> component2() {
        return this.low;
    }

    public final List<Double> component3() {
        return this.middle;
    }

    public final List<Double> component4() {
        return this.high;
    }

    public final List<Double> component5() {
        return this.highest;
    }

    public final ZoneRanges copy(List<Double> lowest, List<Double> low, List<Double> middle, List<Double> high, List<Double> highest) {
        u.j(lowest, "lowest");
        u.j(low, "low");
        u.j(middle, "middle");
        u.j(high, "high");
        u.j(highest, "highest");
        return new ZoneRanges(lowest, low, middle, high, highest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRanges)) {
            return false;
        }
        ZoneRanges zoneRanges = (ZoneRanges) obj;
        if (u.e(this.lowest, zoneRanges.lowest) && u.e(this.low, zoneRanges.low) && u.e(this.middle, zoneRanges.middle) && u.e(this.high, zoneRanges.high) && u.e(this.highest, zoneRanges.highest)) {
            return true;
        }
        return false;
    }

    public final List<Double> getHigh() {
        return this.high;
    }

    public final List<Double> getHighest() {
        return this.highest;
    }

    public final List<Double> getLow() {
        return this.low;
    }

    public final List<Double> getLowest() {
        return this.lowest;
    }

    public final List<Double> getMiddle() {
        return this.middle;
    }

    public int hashCode() {
        return this.highest.hashCode() + e.b(this.high, e.b(this.middle, e.b(this.low, this.lowest.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        List<Double> list = this.lowest;
        List<Double> list2 = this.low;
        List<Double> list3 = this.middle;
        List<Double> list4 = this.high;
        List<Double> list5 = this.highest;
        StringBuilder sb2 = new StringBuilder("ZoneRanges(lowest=");
        sb2.append(list);
        sb2.append(", low=");
        sb2.append(list2);
        sb2.append(", middle=");
        a.a(sb2, list3, ", high=", list4, ", highest=");
        return d.i(sb2, list5, ")");
    }
}
