package com.withings.ecg.details;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class o implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38276a;

    public o(g gVar) {
        this.f38276a = gVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        boolean L1;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        g gVar = this.f38276a;
        w0 w0Var = gVar.f38202h;
        if (w0Var != null) {
            long J1 = gVar.J1();
            long C1 = g.C1(gVar);
            L1 = gVar.L1();
            return w0Var.a(J1, C1, L1);
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
