package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class z0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02ToiletInstallationActivity f55467a;

    public z0(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity) {
        this.f55467a = wpa02ToiletInstallationActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity = this.f55467a;
        r rVar = wpa02ToiletInstallationActivity.f55337f;
        if (rVar != null) {
            return rVar.a(Wpa02ToiletInstallationActivity.C3(wpa02ToiletInstallationActivity));
        }
        kotlin.jvm.internal.u.s("toiletDeviceViewModelFactory");
        throw null;
    }
}
