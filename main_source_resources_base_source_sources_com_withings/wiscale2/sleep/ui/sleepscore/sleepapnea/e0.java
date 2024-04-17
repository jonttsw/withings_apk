package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.lifecycle.k1;
import com.withings.user.core.models.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class e0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f61296a;

    public e0(s sVar) {
        this.f61296a = sVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        boolean H1;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        s sVar = this.f61296a;
        k0 k0Var = sVar.f61454o;
        if (k0Var != null) {
            User B1 = s.B1(sVar);
            long A1 = s.A1(sVar);
            H1 = sVar.H1();
            return k0Var.a(A1, B1, H1);
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
