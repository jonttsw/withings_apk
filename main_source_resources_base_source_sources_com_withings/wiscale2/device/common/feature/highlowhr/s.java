package com.withings.wiscale2.device.common.feature.highlowhr;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class s implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRActivationActivity f52311a;

    public s(HighLowHRActivationActivity highLowHRActivationActivity) {
        this.f52311a = highLowHRActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        HighLowHRActivationActivity highLowHRActivationActivity = this.f52311a;
        j0 j0Var = highLowHRActivationActivity.f52186i;
        if (j0Var != null) {
            return j0Var.a(HighLowHRActivationActivity.E3(highLowHRActivationActivity), HighLowHRActivationActivity.D3(highLowHRActivationActivity));
        }
        kotlin.jvm.internal.u.s("highLowHrActivationViewModelFactory");
        throw null;
    }
}
