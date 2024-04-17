package com.withings.wiscale2.vo2max.view;

import android.app.Application;
import androidx.lifecycle.k1;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class a1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Vo2maxActivity f62685a;

    public a1(Vo2maxActivity vo2maxActivity) {
        this.f62685a = vo2maxActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        boolean z5;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Vo2maxActivity vo2maxActivity = this.f62685a;
        Application application = vo2maxActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        User A3 = Vo2maxActivity.A3(vo2maxActivity);
        fy.n nVar = vo2maxActivity.f62652e;
        if (nVar != null) {
            p60.c cVar = vo2maxActivity.f62653f;
            if (cVar != null) {
                z5 = vo2maxActivity.f62654g;
                return new c2(application, A3, nVar, cVar, z5);
            }
            kotlin.jvm.internal.u.s("explanationsRepository");
            throw null;
        }
        kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypesUseCase");
        throw null;
    }
}
