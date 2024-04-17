package com.withings.ecg.details;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class g2 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgResultActivity f38228a;

    public g2(EcgResultActivity ecgResultActivity) {
        this.f38228a = ecgResultActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EcgResultActivity ecgResultActivity = this.f38228a;
        w0 w0Var = ecgResultActivity.f38026e;
        if (w0Var != null) {
            return w0Var.a(EcgResultActivity.z3(ecgResultActivity), EcgResultActivity.B3(ecgResultActivity).q(), true);
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
