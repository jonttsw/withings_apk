package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class b9 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51222b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(0);
        this.f51221a = wBS08EcgActivationActivity;
        this.f51222b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        WBS08EcgActivationViewModel R3;
        R3 = this.f51221a.R3();
        R3.t0();
        androidx.navigation.e.L(this.f51222b, "HowToRecordAnECG", null, 6);
        return nm0.y.f85009a;
    }
}
