package com.withings.wiscale2.device.common.feature.spo2;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class m implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spo2ActivationActivity f52534a;

    public m(Spo2ActivationActivity spo2ActivationActivity) {
        this.f52534a = spo2ActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        Device F3;
        u.j(modelClass, "modelClass");
        Spo2ActivationActivity spo2ActivationActivity = this.f52534a;
        r rVar = spo2ActivationActivity.f52510e;
        if (rVar != null) {
            F3 = spo2ActivationActivity.F3();
            return rVar.a(F3);
        }
        u.s("viewModelFactory");
        throw null;
    }
}
