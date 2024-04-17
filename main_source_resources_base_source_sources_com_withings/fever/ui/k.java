package com.withings.fever.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.periodsbar.Period;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class k implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyTemperatureActivity f39312a;

    public k(BodyTemperatureActivity bodyTemperatureActivity) {
        this.f39312a = bodyTemperatureActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        BodyTemperatureActivity bodyTemperatureActivity = this.f39312a;
        p0 p0Var = bodyTemperatureActivity.f39204g;
        if (p0Var != null) {
            Long A3 = BodyTemperatureActivity.A3(bodyTemperatureActivity);
            Period.a aVar = Period.f43718c;
            return p0Var.a(A3, BodyTemperatureActivity.z3(bodyTemperatureActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
