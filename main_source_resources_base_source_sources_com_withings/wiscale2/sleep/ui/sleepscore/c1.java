package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.lifecycle.k1;
import com.withings.user.core.models.User;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import org.joda.time.DateTime;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class c1 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f60901a;

    public c1(k0 k0Var) {
        this.f60901a = k0Var;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        k0 k0Var = this.f60901a;
        s1 s1Var = k0Var.f61075n0;
        if (s1Var != null) {
            User S1 = k0Var.S1();
            DateTime A1 = k0.A1(k0Var);
            long id2 = k0Var.S1().getId();
            ei0.q qVar = k0Var.f61077o0;
            if (qVar != null) {
                return s1Var.a(S1, A1, new SleepScoreRecalculator(id2, qVar));
            }
            kotlin.jvm.internal.u.s("sleepTrackManager");
            throw null;
        }
        kotlin.jvm.internal.u.s("sleepDayViewModelFactory");
        throw null;
    }
}
