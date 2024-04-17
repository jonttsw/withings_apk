package com.withings.wiscale2.profile;

import androidx.lifecycle.k1;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class z implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59544a;

    public z(q qVar) {
        this.f59544a = qVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        User R1;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        q qVar = this.f59544a;
        c1 c1Var = qVar.G;
        if (c1Var != null) {
            R1 = qVar.R1();
            return c1Var.create(R1);
        }
        kotlin.jvm.internal.u.s("profileViewModelFactory");
        throw null;
    }
}
