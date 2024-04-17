package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class o7 extends kotlin.jvm.internal.w implements ym0.p<String, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51605a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(2);
        this.f51605a = wBS08EcgActivationActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(String str, String str2) {
        WBS08EcgActivationViewModel R3;
        String inputString = str2;
        kotlin.jvm.internal.u.j(str, "<anonymous parameter 0>");
        kotlin.jvm.internal.u.j(inputString, "inputString");
        R3 = this.f51605a.R3();
        R3.W0().setValue(inputString);
        return nm0.y.f85009a;
    }
}
