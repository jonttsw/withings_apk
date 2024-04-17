package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import k1.r0;
/* compiled from: Wpa02CleansingModeActivity.kt */
/* loaded from: classes5.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02CleansingModeActivity f55300a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f55301b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f55302c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Wpa02CleansingModeActivity wpa02CleansingModeActivity, r8.n nVar, r0<Boolean> r0Var) {
        super(3);
        this.f55300a = wpa02CleansingModeActivity;
        this.f55301b = nVar;
        this.f55302c = r0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            Wpa02CleansingModeActivity wpa02CleansingModeActivity = this.f55300a;
            i0 i0Var = new i0(wpa02CleansingModeActivity);
            e.a(this.f55301b, this.f55302c.getValue().booleanValue(), null, i0Var, new j0(wpa02CleansingModeActivity), new k0(wpa02CleansingModeActivity), aVar2, 8, 4);
        }
        return nm0.y.f85009a;
    }
}
