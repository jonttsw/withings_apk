package com.withings.weight.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BodyCompositionBundle.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/weight/android/model/BodyCompositionBundle;", "", "fat", "Lcom/withings/weight/android/model/BodyComposition;", "muscle", "(Lcom/withings/weight/android/model/BodyComposition;Lcom/withings/weight/android/model/BodyComposition;)V", "getFat", "()Lcom/withings/weight/android/model/BodyComposition;", "getMuscle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BodyCompositionBundle {
    private final BodyComposition fat;
    private final BodyComposition muscle;

    public BodyCompositionBundle(BodyComposition fat, BodyComposition muscle) {
        u.j(fat, "fat");
        u.j(muscle, "muscle");
        this.fat = fat;
        this.muscle = muscle;
    }

    public static /* synthetic */ BodyCompositionBundle copy$default(BodyCompositionBundle bodyCompositionBundle, BodyComposition bodyComposition, BodyComposition bodyComposition2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bodyComposition = bodyCompositionBundle.fat;
        }
        if ((i11 & 2) != 0) {
            bodyComposition2 = bodyCompositionBundle.muscle;
        }
        return bodyCompositionBundle.copy(bodyComposition, bodyComposition2);
    }

    public final BodyComposition component1() {
        return this.fat;
    }

    public final BodyComposition component2() {
        return this.muscle;
    }

    public final BodyCompositionBundle copy(BodyComposition fat, BodyComposition muscle) {
        u.j(fat, "fat");
        u.j(muscle, "muscle");
        return new BodyCompositionBundle(fat, muscle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyCompositionBundle)) {
            return false;
        }
        BodyCompositionBundle bodyCompositionBundle = (BodyCompositionBundle) obj;
        if (u.e(this.fat, bodyCompositionBundle.fat) && u.e(this.muscle, bodyCompositionBundle.muscle)) {
            return true;
        }
        return false;
    }

    public final BodyComposition getFat() {
        return this.fat;
    }

    public final BodyComposition getMuscle() {
        return this.muscle;
    }

    public int hashCode() {
        return this.muscle.hashCode() + (this.fat.hashCode() * 31);
    }

    public String toString() {
        BodyComposition bodyComposition = this.fat;
        BodyComposition bodyComposition2 = this.muscle;
        return "BodyCompositionBundle(fat=" + bodyComposition + ", muscle=" + bodyComposition2 + ")";
    }
}
