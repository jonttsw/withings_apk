package com.withings.weight.android.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformCompositionRange.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/withings/weight/android/model/PlatformCompositionRangeBundle;", "", "fatPercent", "", "Lcom/withings/weight/android/model/PlatformCompositionRange;", "muscleMass", "(Ljava/util/List;Ljava/util/List;)V", "getFatPercent", "()Ljava/util/List;", "getMuscleMass", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformCompositionRangeBundle {
    private final List<PlatformCompositionRange> fatPercent;
    private final List<PlatformCompositionRange> muscleMass;

    public PlatformCompositionRangeBundle(List<PlatformCompositionRange> fatPercent, List<PlatformCompositionRange> muscleMass) {
        u.j(fatPercent, "fatPercent");
        u.j(muscleMass, "muscleMass");
        this.fatPercent = fatPercent;
        this.muscleMass = muscleMass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformCompositionRangeBundle copy$default(PlatformCompositionRangeBundle platformCompositionRangeBundle, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = platformCompositionRangeBundle.fatPercent;
        }
        if ((i11 & 2) != 0) {
            list2 = platformCompositionRangeBundle.muscleMass;
        }
        return platformCompositionRangeBundle.copy(list, list2);
    }

    public final List<PlatformCompositionRange> component1() {
        return this.fatPercent;
    }

    public final List<PlatformCompositionRange> component2() {
        return this.muscleMass;
    }

    public final PlatformCompositionRangeBundle copy(List<PlatformCompositionRange> fatPercent, List<PlatformCompositionRange> muscleMass) {
        u.j(fatPercent, "fatPercent");
        u.j(muscleMass, "muscleMass");
        return new PlatformCompositionRangeBundle(fatPercent, muscleMass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformCompositionRangeBundle)) {
            return false;
        }
        PlatformCompositionRangeBundle platformCompositionRangeBundle = (PlatformCompositionRangeBundle) obj;
        if (u.e(this.fatPercent, platformCompositionRangeBundle.fatPercent) && u.e(this.muscleMass, platformCompositionRangeBundle.muscleMass)) {
            return true;
        }
        return false;
    }

    public final List<PlatformCompositionRange> getFatPercent() {
        return this.fatPercent;
    }

    public final List<PlatformCompositionRange> getMuscleMass() {
        return this.muscleMass;
    }

    public int hashCode() {
        return this.muscleMass.hashCode() + (this.fatPercent.hashCode() * 31);
    }

    public String toString() {
        List<PlatformCompositionRange> list = this.fatPercent;
        List<PlatformCompositionRange> list2 = this.muscleMass;
        return "PlatformCompositionRangeBundle(fatPercent=" + list + ", muscleMass=" + list2 + ")";
    }
}
