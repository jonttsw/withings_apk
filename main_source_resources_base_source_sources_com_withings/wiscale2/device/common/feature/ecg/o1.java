package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class o1 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51551a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51551a = ecgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        EcgActivationActivity ecgActivationActivity = this.f51551a;
        ecgActivationActivity.U3().K1().setValue(it);
        ecgActivationActivity.U3().L1().setValue(null);
        return nm0.y.f85009a;
    }
}
