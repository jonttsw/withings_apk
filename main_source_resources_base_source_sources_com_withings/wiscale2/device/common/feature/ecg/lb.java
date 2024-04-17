package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class lb extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51509a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51510b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51509a = wBS08EcgActivationActivity;
        this.f51510b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f51510b;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51509a;
        androidx.navigation.compose.n.b(navigation, "VideoCallIntro", null, null, null, null, null, null, new s1.a(true, -881884044, new eb(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "PhoneNumberInput", null, null, null, null, null, null, new s1.a(true, 1848994141, new hb(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "SmsCodeInput", null, null, null, null, null, null, new s1.a(true, 1678154684, new kb(nVar, wBS08EcgActivationActivity)), 126);
        return nm0.y.f85009a;
    }
}
