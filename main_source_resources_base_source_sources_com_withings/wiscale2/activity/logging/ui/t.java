package com.withings.wiscale2.activity.logging.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class t implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48453a;

    public t(EditWorkoutActivity editWorkoutActivity) {
        this.f48453a = editWorkoutActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EditWorkoutActivity editWorkoutActivity = this.f48453a;
        t0 t0Var = editWorkoutActivity.f48280e;
        if (t0Var != null) {
            return t0Var.a(EditWorkoutActivity.m4(editWorkoutActivity), EditWorkoutActivity.s4(editWorkoutActivity), EditWorkoutActivity.b4(editWorkoutActivity), EditWorkoutActivity.c4(editWorkoutActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
