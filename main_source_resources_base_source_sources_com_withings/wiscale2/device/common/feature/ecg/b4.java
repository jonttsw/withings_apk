package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class b4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t5 f51212b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f51213c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(EcgActivationActivity ecgActivationActivity, t5 t5Var, r8.n nVar) {
        super(0);
        this.f51211a = ecgActivationActivity;
        this.f51212b = t5Var;
        this.f51213c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f51211a.U3().G1().setValue(this.f51212b);
        this.f51213c.N();
        return nm0.y.f85009a;
    }
}
