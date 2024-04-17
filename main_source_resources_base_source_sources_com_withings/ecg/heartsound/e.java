package com.withings.ecg.heartsound;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class e implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38464a;

    public e(d dVar) {
        this.f38464a = dVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        d dVar = this.f38464a;
        a0 a0Var = dVar.f38435m;
        if (a0Var != null) {
            return a0Var.a(d.z1(dVar));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
