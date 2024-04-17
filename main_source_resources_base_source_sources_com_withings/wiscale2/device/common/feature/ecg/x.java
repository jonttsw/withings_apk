package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52096a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(EcgActivationActivity ecgActivationActivity) {
        super(2);
        this.f52096a = ecgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            EcgActivationActivity ecgActivationActivity = this.f52096a;
            g5 g5Var = (g5) ecgActivationActivity.U3().A1().getValue();
            if (g5Var != null) {
                String e11 = g5Var.e();
                aVar2.s(638533023);
                if (e11 == null) {
                    e11 = ay.b.u(g5Var.d(), aVar2);
                }
                aVar2.J();
                boolean b10 = g5Var.b();
                boolean c11 = g5Var.c();
                o4 U3 = ecgActivationActivity.U3();
                U3.getClass();
                com.withings.common.compose.component.l.a(null, e11, null, b10, null, null, c11, new w4(U3), aVar2, 0, 53);
            }
        }
        return nm0.y.f85009a;
    }
}
