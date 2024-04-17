package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class pa extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51647a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(2);
        this.f51647a = wBS08EcgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        WBS08EcgActivationViewModel R3;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            xb.b v11 = androidx.activity.b0.v(aVar2);
            c11.D().b(v11);
            WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51647a;
            R3 = wBS08EcgActivationActivity.R3();
            R3.getClass();
            R3.f51120i = c11;
            k1.y.f("initObserver", new ma(wBS08EcgActivationActivity, null), aVar2);
            WBS08EcgActivationActivity.M3(wBS08EcgActivationActivity, c11, aVar2, 72);
            androidx.compose.runtime.j.a(e.m.b(wBS08EcgActivationActivity), s1.b.b(aVar2, 1503805450, new oa(wBS08EcgActivationActivity, c11, v11)), aVar2, 56);
            WBS08EcgActivationActivity.L3(wBS08EcgActivationActivity, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
