package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class a6 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51181a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51181a = wBS08EcgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        WBS08EcgActivationViewModel R3;
        Boolean bool2 = bool;
        bool2.getClass();
        R3 = this.f51181a.R3();
        R3.R0().setValue(bool2);
        return nm0.y.f85009a;
    }
}
