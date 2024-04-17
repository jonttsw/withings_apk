package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class va extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52073a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52074b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f52073a = wBS08EcgActivationActivity;
        this.f52074b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        androidx.compose.runtime.a aVar2 = aVar;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(433076167);
        Object t11 = aVar2.t();
        a.C0060a.C0061a a11 = a.C0060a.a();
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f52073a;
        if (t11 == a11) {
            R32 = wBS08EcgActivationActivity.R3();
            t11 = R32.a1();
            aVar2.n(t11);
        }
        aVar2.J();
        t5 t5Var = (t5) ((k1.r0) t11).getValue();
        sa saVar = new sa(this.f52074b);
        R3 = wBS08EcgActivationActivity.R3();
        ta taVar = new ta(R3);
        ua uaVar = new ua(wBS08EcgActivationActivity);
        WBS08EcgActivationActivity.K3(this.f52073a, this.f52074b, t5Var, saVar, taVar, uaVar, aVar2, 262152);
        return nm0.y.f85009a;
    }
}
