package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationViewModel.kt */
/* loaded from: classes5.dex */
final class y4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o4 f52122a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(o4 o4Var) {
        super(0);
        this.f52122a = o4Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        String str;
        o4 o4Var = this.f52122a;
        if (o4Var.m1()) {
            androidx.navigation.t y11 = o4Var.s1().y();
            if (y11 != null) {
                str = y11.v();
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.u.e(str, "Video")) {
                o4Var.Z1(false);
                o4.T0(o4Var);
            }
        }
        return nm0.y.f85009a;
    }
}
