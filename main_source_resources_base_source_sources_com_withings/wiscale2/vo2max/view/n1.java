package com.withings.wiscale2.vo2max.view;

import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.k1;
import com.withings.library.measure.MeasuresGroup;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class n1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f62791a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i1 f62792b;

    public n1(View view, i1 i1Var) {
        this.f62791a = view;
        this.f62792b = i1Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Context applicationContext = this.f62791a.getContext().getApplicationContext();
        kotlin.jvm.internal.u.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        i1 i1Var = this.f62792b;
        MeasuresGroup w12 = i1.w1(i1Var);
        fy.c0 c0Var = i1Var.f62764i;
        if (c0Var != null) {
            zx.r rVar = i1Var.f62765j;
            if (rVar != null) {
                return new a2(application, rVar, w12, c0Var);
            }
            kotlin.jvm.internal.u.s("sendAccountMeasureGroups");
            throw null;
        }
        kotlin.jvm.internal.u.s("updateMeasureGroupUseCase");
        throw null;
    }
}
