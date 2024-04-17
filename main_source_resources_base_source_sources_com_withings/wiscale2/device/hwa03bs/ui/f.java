package com.withings.wiscale2.device.hwa03bs.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class f implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa03PostInstallActivity f54262a;

    public f(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        this.f54262a = hwa03PostInstallActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        Device N3;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Hwa03PostInstallActivity hwa03PostInstallActivity = this.f54262a;
        User F3 = Hwa03PostInstallActivity.F3(hwa03PostInstallActivity);
        N3 = hwa03PostInstallActivity.N3();
        bx.a aVar = hwa03PostInstallActivity.f54243j;
        if (aVar != null) {
            return new qc0.q(F3, N3, aVar, Hwa03PostInstallActivity.B3(hwa03PostInstallActivity));
        }
        kotlin.jvm.internal.u.s("sharedLiveWorkoutInfo");
        throw null;
    }
}
