package com.withings.weight.android.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformCompositionRange.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/withings/weight/android/model/PlatformCompositionRange;", "", "gender", "", "normalityZones", "", "Lcom/withings/weight/android/model/NormalityZone;", "(ILjava/util/List;)V", "getGender", "()I", "getNormalityZones", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformCompositionRange {
    private final int gender;
    private final List<NormalityZone> normalityZones;

    public PlatformCompositionRange(int i11, List<NormalityZone> normalityZones) {
        u.j(normalityZones, "normalityZones");
        this.gender = i11;
        this.normalityZones = normalityZones;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformCompositionRange copy$default(PlatformCompositionRange platformCompositionRange, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = platformCompositionRange.gender;
        }
        if ((i12 & 2) != 0) {
            list = platformCompositionRange.normalityZones;
        }
        return platformCompositionRange.copy(i11, list);
    }

    public final int component1() {
        return this.gender;
    }

    public final List<NormalityZone> component2() {
        return this.normalityZones;
    }

    public final PlatformCompositionRange copy(int i11, List<NormalityZone> normalityZones) {
        u.j(normalityZones, "normalityZones");
        return new PlatformCompositionRange(i11, normalityZones);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformCompositionRange)) {
            return false;
        }
        PlatformCompositionRange platformCompositionRange = (PlatformCompositionRange) obj;
        if (this.gender == platformCompositionRange.gender && u.e(this.normalityZones, platformCompositionRange.normalityZones)) {
            return true;
        }
        return false;
    }

    public final int getGender() {
        return this.gender;
    }

    public final List<NormalityZone> getNormalityZones() {
        return this.normalityZones;
    }

    public int hashCode() {
        return this.normalityZones.hashCode() + (Integer.hashCode(this.gender) * 31);
    }

    public String toString() {
        int i11 = this.gender;
        List<NormalityZone> list = this.normalityZones;
        return "PlatformCompositionRange(gender=" + i11 + ", normalityZones=" + list + ")";
    }
}
