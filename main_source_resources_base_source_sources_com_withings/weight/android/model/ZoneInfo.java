package com.withings.weight.android.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformCompositionRange.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/withings/weight/android/model/ZoneInfo;", "", "heightRange", "", "", "zones", "Lcom/withings/weight/android/model/ZoneRanges;", "(Ljava/util/List;Lcom/withings/weight/android/model/ZoneRanges;)V", "getHeightRange", "()Ljava/util/List;", "getZones", "()Lcom/withings/weight/android/model/ZoneRanges;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ZoneInfo {
    @SerializedName("height_range")
    private final List<Integer> heightRange;
    private final ZoneRanges zones;

    public ZoneInfo(List<Integer> heightRange, ZoneRanges zones) {
        u.j(heightRange, "heightRange");
        u.j(zones, "zones");
        this.heightRange = heightRange;
        this.zones = zones;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneInfo copy$default(ZoneInfo zoneInfo, List list, ZoneRanges zoneRanges, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = zoneInfo.heightRange;
        }
        if ((i11 & 2) != 0) {
            zoneRanges = zoneInfo.zones;
        }
        return zoneInfo.copy(list, zoneRanges);
    }

    public final List<Integer> component1() {
        return this.heightRange;
    }

    public final ZoneRanges component2() {
        return this.zones;
    }

    public final ZoneInfo copy(List<Integer> heightRange, ZoneRanges zones) {
        u.j(heightRange, "heightRange");
        u.j(zones, "zones");
        return new ZoneInfo(heightRange, zones);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneInfo)) {
            return false;
        }
        ZoneInfo zoneInfo = (ZoneInfo) obj;
        if (u.e(this.heightRange, zoneInfo.heightRange) && u.e(this.zones, zoneInfo.zones)) {
            return true;
        }
        return false;
    }

    public final List<Integer> getHeightRange() {
        return this.heightRange;
    }

    public final ZoneRanges getZones() {
        return this.zones;
    }

    public int hashCode() {
        return this.zones.hashCode() + (this.heightRange.hashCode() * 31);
    }

    public String toString() {
        List<Integer> list = this.heightRange;
        ZoneRanges zoneRanges = this.zones;
        return "ZoneInfo(heightRange=" + list + ", zones=" + zoneRanges + ")";
    }
}
