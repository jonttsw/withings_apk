package com.withings.wiscale2.coretemperature.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class d implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreCoreTemperatureActivity f50426a;

    public d(ExploreCoreTemperatureActivity exploreCoreTemperatureActivity) {
        this.f50426a = exploreCoreTemperatureActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        ExploreCoreTemperatureActivity exploreCoreTemperatureActivity = this.f50426a;
        p pVar = exploreCoreTemperatureActivity.f50412e;
        if (pVar != null) {
            return pVar.a(ExploreCoreTemperatureActivity.z3(exploreCoreTemperatureActivity));
        }
        u.s("exploreCoreTemperatureViewModelFactory");
        throw null;
    }
}
