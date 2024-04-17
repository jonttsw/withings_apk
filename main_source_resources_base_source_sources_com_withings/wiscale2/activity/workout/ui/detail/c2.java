package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.os.PowerManager;
import androidx.lifecycle.k1;
import com.withings.user.User;
import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class c2 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49145a;

    public c2(x1 x1Var) {
        this.f49145a = x1Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        User user;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        x1 x1Var = this.f49145a;
        y3 y3Var = x1Var.A;
        if (y3Var != null) {
            user = x1Var.getUser();
            long P1 = x1.P1(x1Var);
            WorkoutCategory B1 = x1.B1(x1Var);
            Context requireContext = x1Var.requireContext();
            Object systemService = x1Var.requireContext().getSystemService("power");
            kotlin.jvm.internal.u.h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            va0.d dVar = new va0.d(x1Var);
            kotlin.jvm.internal.u.g(requireContext);
            return y3Var.a(user, P1, B1, (PowerManager) systemService, requireContext, dVar);
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
