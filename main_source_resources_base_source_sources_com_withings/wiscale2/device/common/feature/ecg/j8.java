package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class j8 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51452a = wBS08EcgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        WBS08EcgActivationViewModel R3;
        WBS08EcgActivationViewModel R32;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51452a;
        R3 = wBS08EcgActivationActivity.R3();
        R3.c1().setValue(it);
        R32 = wBS08EcgActivationActivity.R3();
        R32.d1().setValue(null);
        return nm0.y.f85009a;
    }
}
