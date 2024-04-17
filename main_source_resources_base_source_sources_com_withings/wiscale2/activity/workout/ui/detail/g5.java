package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.ArrayList;
import java.util.List;
/* compiled from: WorkoutListActivity.kt */
/* loaded from: classes4.dex */
public final class g5 {

    /* renamed from: a  reason: collision with root package name */
    private final List<t1> f49201a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49202b;

    public g5(ArrayList arrayList, int i11) {
        this.f49201a = arrayList;
        this.f49202b = i11;
    }

    public final List<t1> a() {
        return this.f49201a;
    }

    public final int b() {
        return this.f49202b;
    }

    public final List<t1> c() {
        return this.f49201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        if (kotlin.jvm.internal.u.e(this.f49201a, g5Var.f49201a) && this.f49202b == g5Var.f49202b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49202b) + (this.f49201a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkoutInfoList(workouts=" + this.f49201a + ", currentItem=" + this.f49202b + ")";
    }
}
