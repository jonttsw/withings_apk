package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class w3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52081a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(EcgActivationActivity ecgActivationActivity) {
        super(2);
        this.f52081a = ecgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            xb.b v11 = androidx.activity.b0.v(aVar2);
            c11.D().b(v11);
            EcgActivationActivity ecgActivationActivity = this.f52081a;
            o4 U3 = ecgActivationActivity.U3();
            U3.getClass();
            U3.f51565l = c11;
            k1.y.f("initObserver", new t3(ecgActivationActivity, null), aVar2);
            EcgActivationActivity.N3(ecgActivationActivity, c11, aVar2, 72);
            androidx.compose.runtime.j.a(e.m.b(ecgActivationActivity), s1.b.b(aVar2, -789932894, new v3(ecgActivationActivity, c11, v11)), aVar2, 56);
            EcgActivationActivity.M3(ecgActivationActivity, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}
