package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.wiscale2.device.common.feature.q;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51511a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51512b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51511a = ecgActivationActivity;
        this.f51512b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        EcgActivationActivity ecgActivationActivity = this.f51511a;
        com.withings.wiscale2.device.common.feature.q qVar = (com.withings.wiscale2.device.common.feature.q) t1.d.a(ecgActivationActivity.U3().d1(), aVar2).getValue();
        if (qVar != null) {
            boolean z5 = qVar instanceof q.a;
        }
        ecgActivationActivity.U3().j2();
        o4 U3 = ecgActivationActivity.U3();
        U3.getClass();
        com.withings.wiscale2.device.common.feature.m.a(qVar, new u4(U3), new l(this.f51512b), aVar2, 0);
        return nm0.y.f85009a;
    }
}
