package com.withings.wiscale2.vascularage;

import androidx.lifecycle.k1;
import com.withings.periodsbar.Period;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class o implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivity f62431a;

    public o(VascularAgeActivity vascularAgeActivity) {
        this.f62431a = vascularAgeActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        VascularAgeActivity vascularAgeActivity = this.f62431a;
        m1 m1Var = vascularAgeActivity.f62192e;
        Long l5 = null;
        if (m1Var != null) {
            User A3 = VascularAgeActivity.A3(vascularAgeActivity);
            if (A3 != null) {
                l5 = Long.valueOf(A3.q());
            }
            Period.a aVar = Period.f43718c;
            return m1Var.a(l5, VascularAgeActivity.z3(vascularAgeActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
