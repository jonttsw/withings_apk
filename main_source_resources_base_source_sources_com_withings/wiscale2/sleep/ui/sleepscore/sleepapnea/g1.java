package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class g1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f61335a;

    public g1(w0 w0Var) {
        this.f61335a = w0Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        if (ei0.q.f65441d != null) {
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                w0 w0Var = this.f61335a;
                return new j1(qVar, w0.w1(w0Var), w0.t1(w0Var), w0.u1(w0Var), w0.z1(w0Var));
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }
}
