package com.withings.wiscale2.device.common.feature.spo2;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class f implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SpO2SettingsActivity f52528a;

    public f(SpO2SettingsActivity spO2SettingsActivity) {
        this.f52528a = spO2SettingsActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        SpO2SettingsActivity spO2SettingsActivity = this.f52528a;
        s sVar = spO2SettingsActivity.f52497e;
        if (sVar != null) {
            return sVar.a(SpO2SettingsActivity.A3(spO2SettingsActivity));
        }
        u.s("viewModelFactory");
        throw null;
    }
}
