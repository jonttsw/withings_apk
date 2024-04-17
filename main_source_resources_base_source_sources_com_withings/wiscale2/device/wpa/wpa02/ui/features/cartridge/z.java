package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class z implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02CartridgeActivationActivity f55217a;

    public z(Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity) {
        this.f55217a = wpa02CartridgeActivationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Wpa02CartridgeActivationActivity wpa02CartridgeActivationActivity = this.f55217a;
        k0 k0Var = wpa02CartridgeActivationActivity.f55110e;
        if (k0Var != null) {
            return k0Var.a(Wpa02CartridgeActivationActivity.C3(wpa02CartridgeActivationActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}
