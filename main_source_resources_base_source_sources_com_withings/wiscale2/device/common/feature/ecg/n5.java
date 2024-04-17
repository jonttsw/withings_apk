package com.withings.wiscale2.device.common.feature.ecg;

import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class n5 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgSettingsActivity f51534a;

    public n5(EcgSettingsActivity ecgSettingsActivity) {
        this.f51534a = ecgSettingsActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        EcgSettingsActivity ecgSettingsActivity = this.f51534a;
        q5 q5Var = ecgSettingsActivity.f51080f;
        if (q5Var != null) {
            return q5Var.a(EcgSettingsActivity.C3(ecgSettingsActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
