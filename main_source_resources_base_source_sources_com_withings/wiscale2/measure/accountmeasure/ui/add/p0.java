package com.withings.wiscale2.measure.accountmeasure.ui.add;

import androidx.lifecycle.k1;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class p0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f58264a;

    public p0(o0 o0Var) {
        this.f58264a = o0Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        o0 o0Var = this.f58264a;
        User user = o0Var.getUser();
        double H1 = o0.H1(o0Var);
        fy.p pVar = o0Var.f58257z;
        if (pVar != null) {
            cy.a aVar = o0Var.A;
            if (aVar != null) {
                return new z0(user, H1, pVar, aVar);
            }
            kotlin.jvm.internal.u.s("measureListenerRegisterUseCase");
            throw null;
        }
        kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
        throw null;
    }
}
