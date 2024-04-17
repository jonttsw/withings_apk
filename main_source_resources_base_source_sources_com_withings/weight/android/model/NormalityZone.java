package com.withings.weight.android.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformCompositionRange.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/withings/weight/android/model/NormalityZone;", "", "bodyPart", "", "zones", "", "Lcom/withings/weight/android/model/ZoneInfo;", "(Ljava/lang/String;Ljava/util/List;)V", "getBodyPart", "()Ljava/lang/String;", "getZones", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NormalityZone {
    private final String bodyPart;
    private final List<ZoneInfo> zones;

    public NormalityZone(String bodyPart, List<ZoneInfo> zones) {
        u.j(bodyPart, "bodyPart");
        u.j(zones, "zones");
        this.bodyPart = bodyPart;
        this.zones = zones;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NormalityZone copy$default(NormalityZone normalityZone, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = normalityZone.bodyPart;
        }
        if ((i11 & 2) != 0) {
            list = normalityZone.zones;
        }
        return normalityZone.copy(str, list);
    }

    public final String component1() {
        return this.bodyPart;
    }

    public final List<ZoneInfo> component2() {
        return this.zones;
    }

    public final NormalityZone copy(String bodyPart, List<ZoneInfo> zones) {
        u.j(bodyPart, "bodyPart");
        u.j(zones, "zones");
        return new NormalityZone(bodyPart, zones);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalityZone)) {
            return false;
        }
        NormalityZone normalityZone = (NormalityZone) obj;
        if (u.e(this.bodyPart, normalityZone.bodyPart) && u.e(this.zones, normalityZone.zones)) {
            return true;
        }
        return false;
    }

    public final String getBodyPart() {
        return this.bodyPart;
    }

    public final List<ZoneInfo> getZones() {
        return this.zones;
    }

    public int hashCode() {
        return this.zones.hashCode() + (this.bodyPart.hashCode() * 31);
    }

    public String toString() {
        String str = this.bodyPart;
        List<ZoneInfo> list = this.zones;
        return "NormalityZone(bodyPart=" + str + ", zones=" + list + ")";
    }
}
