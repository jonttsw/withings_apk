package com.withings.wiscale2.device.wam03.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class e implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wam03PostInstallActivity f54992a;

    public e(Wam03PostInstallActivity wam03PostInstallActivity) {
        this.f54992a = wam03PostInstallActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        Device N3;
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        Wam03PostInstallActivity wam03PostInstallActivity = this.f54992a;
        User F3 = Wam03PostInstallActivity.F3(wam03PostInstallActivity);
        N3 = wam03PostInstallActivity.N3();
        bx.a aVar = wam03PostInstallActivity.f54974j;
        if (aVar != null) {
            return new qc0.q(F3, N3, aVar, Wam03PostInstallActivity.B3(wam03PostInstallActivity));
        }
        kotlin.jvm.internal.u.s("sharedLiveWorkoutInfo");
        throw null;
    }
}
