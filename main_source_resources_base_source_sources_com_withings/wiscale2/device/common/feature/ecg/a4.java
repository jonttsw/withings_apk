package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.a;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class a4 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51172b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51171a = ecgActivationActivity;
        this.f51172b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        androidx.compose.material3.j5.e(num, cVar, "$this$composable", dVar, "it");
        aVar2.s(604878886);
        Object t11 = aVar2.t();
        if (t11 == a.C0060a.a()) {
            t11 = this.f51171a.U3().G1();
            aVar2.n(t11);
        }
        aVar2.J();
        t5 t5Var = (t5) ((k1.r0) t11).getValue();
        z3 z3Var = new z3(this.f51172b);
        EcgActivationActivity.L3(this.f51171a, this.f51172b, t5Var, z3Var, aVar2, 4104);
        return nm0.y.f85009a;
    }
}
