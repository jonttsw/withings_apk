package com.withings.wiscale2;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class l2 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MainActivity f57985a;

    public l2(MainActivity mainActivity) {
        this.f57985a = mainActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        MainActivity mainActivity = this.f57985a;
        ch0.f fVar = mainActivity.f47962n;
        if (fVar != null) {
            return fVar.a(new lb0.j(mainActivity), new u70.k(mainActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
