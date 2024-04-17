package com.withings.wiscale2.vo2max.view;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.k1;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class l1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f62784a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i1 f62785b;

    public l1(View view, i1 i1Var) {
        this.f62784a = view;
        this.f62785b = i1Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Context applicationContext = this.f62784a.getContext().getApplicationContext();
        kotlin.jvm.internal.u.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        i1 i1Var = this.f62785b;
        MeasuresGroup w12 = i1.w1(i1Var);
        User v12 = i1.v1(i1Var);
        fy.l lVar = i1Var.f62763h;
        if (lVar != null) {
            return new r0(application, w12, v12, lVar);
        }
        kotlin.jvm.internal.u.s("getMeasureGroupWithAllTypesBetweenUseCase");
        throw null;
    }
}
