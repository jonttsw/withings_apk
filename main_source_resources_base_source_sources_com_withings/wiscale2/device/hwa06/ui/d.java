package com.withings.wiscale2.device.hwa06.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class d implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa06PostInstallActivity f54346a;

    public d(Hwa06PostInstallActivity hwa06PostInstallActivity) {
        this.f54346a = hwa06PostInstallActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Hwa06PostInstallActivity hwa06PostInstallActivity = this.f54346a;
        User E3 = Hwa06PostInstallActivity.E3(hwa06PostInstallActivity);
        Device B3 = Hwa06PostInstallActivity.B3(hwa06PostInstallActivity);
        bx.a aVar = hwa06PostInstallActivity.f54324j;
        if (aVar != null) {
            return new qc0.q(E3, B3, aVar, Hwa06PostInstallActivity.A3(hwa06PostInstallActivity));
        }
        kotlin.jvm.internal.u.s("sharedLiveWorkoutInfo");
        throw null;
    }
}
