package com.withings.fever.ui.temperatureList;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes3.dex */
public final class m implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TemperatureListActivity f39440a;

    public m(TemperatureListActivity temperatureListActivity) {
        this.f39440a = temperatureListActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        TemperatureListActivity temperatureListActivity = this.f39440a;
        r rVar = temperatureListActivity.f39419f;
        if (rVar != null) {
            return rVar.a(TemperatureListActivity.z3(temperatureListActivity));
        }
        u.s("viewModelFactory");
        throw null;
    }
}
