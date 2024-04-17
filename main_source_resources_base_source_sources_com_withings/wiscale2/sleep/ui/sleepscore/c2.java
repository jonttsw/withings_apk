package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class c2 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f60902a;

    public c2(t1 t1Var) {
        this.f60902a = t1Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        if (ei0.q.f65441d != null) {
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                t1 t1Var = this.f60902a;
                return new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.j1(qVar, t1.w1(t1Var), t1.t1(t1Var), t1.u1(t1Var), t1.z1(t1Var));
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }
}
