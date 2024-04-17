package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class wa extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52093a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t5 f52094b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f52095c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(WBS08EcgActivationActivity wBS08EcgActivationActivity, t5 t5Var, r8.n nVar) {
        super(0);
        this.f52093a = wBS08EcgActivationActivity;
        this.f52094b = t5Var;
        this.f52095c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        R3 = this.f52093a.R3();
        R3.a1().setValue(this.f52094b);
        this.f52095c.N();
        return nm0.y.f85009a;
    }
}
