package com.withings.wiscale2.profile;

import com.withings.target.Target;
import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: ProfileTargetView.kt */
/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final Target f59313a;

    /* renamed from: b  reason: collision with root package name */
    private final WorkoutCategory f59314b;

    public d1(Target target, WorkoutCategory workoutCategory) {
        this.f59313a = target;
        this.f59314b = workoutCategory;
    }

    public final Target a() {
        return this.f59313a;
    }

    public final WorkoutCategory b() {
        return this.f59314b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (kotlin.jvm.internal.u.e(this.f59313a, d1Var.f59313a) && kotlin.jvm.internal.u.e(this.f59314b, d1Var.f59314b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f59313a.hashCode() * 31;
        WorkoutCategory workoutCategory = this.f59314b;
        if (workoutCategory == null) {
            hashCode = 0;
        } else {
            hashCode = workoutCategory.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "TargetContainer(target=" + this.f59313a + ", workoutCategory=" + this.f59314b + ")";
    }
}
