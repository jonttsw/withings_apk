package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.w implements ym0.l<h5, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51463a = ecgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(h5 h5Var) {
        h5 h5Var2 = h5Var;
        boolean c11 = h5Var2.c();
        EcgActivationActivity ecgActivationActivity = this.f51463a;
        if (c11) {
            ecgActivationActivity.U3().V1(h5Var2);
        } else if (kotlin.jvm.internal.u.e("Loading", ecgActivationActivity.U3().a1())) {
            ecgActivationActivity.U3().W0(h5Var2);
        }
        return nm0.y.f85009a;
    }
}
