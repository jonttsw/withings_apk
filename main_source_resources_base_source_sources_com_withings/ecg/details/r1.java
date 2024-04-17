package com.withings.ecg.details;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class r1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgListActivity f38303a;

    public r1(EcgListActivity ecgListActivity) {
        this.f38303a = ecgListActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EcgListActivity ecgListActivity = this.f38303a;
        v1 v1Var = ecgListActivity.f38015j;
        if (v1Var != null) {
            return v1Var.a(EcgListActivity.D3(ecgListActivity), EcgListActivity.z3(ecgListActivity), EcgListActivity.B3(ecgListActivity), EcgListActivity.A3(ecgListActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
