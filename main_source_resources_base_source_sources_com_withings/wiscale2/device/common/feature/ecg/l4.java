package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class l4 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51493a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51494b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51493a = ecgActivationActivity;
        this.f51494b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        EcgActivationActivity ecgActivationActivity = this.f51493a;
        androidx.navigation.compose.n.b(navigation, "VideoCallIntro", null, null, null, null, null, null, new s1.a(true, -125536884, new i4(ecgActivationActivity)), 126);
        r8.n nVar = this.f51494b;
        androidx.navigation.compose.n.b(navigation, "PhoneNumberInput", null, null, null, null, null, null, new s1.a(true, 1873721781, new j4(nVar, ecgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "SmsCodeInput", null, null, null, null, null, null, new s1.a(true, -1469413676, new k4(nVar, ecgActivationActivity)), 126);
        return nm0.y.f85009a;
    }
}
