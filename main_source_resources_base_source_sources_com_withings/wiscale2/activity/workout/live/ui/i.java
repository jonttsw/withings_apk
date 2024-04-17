package com.withings.wiscale2.activity.workout.live.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class i implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveWorkoutActivity f48893a;

    public i(LiveWorkoutActivity liveWorkoutActivity) {
        this.f48893a = liveWorkoutActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        LiveWorkoutActivity liveWorkoutActivity = this.f48893a;
        d1 d1Var = liveWorkoutActivity.f48802o;
        if (d1Var != null) {
            return d1Var.a(new va0.d(liveWorkoutActivity), LiveWorkoutActivity.H3(liveWorkoutActivity));
        }
        kotlin.jvm.internal.u.s("liveWorkoutViewModelFactory");
        throw null;
    }
}
