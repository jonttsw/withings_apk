package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class z9 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f52163a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f52164b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f52163a = wBS08EcgActivationActivity;
        this.f52164b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f52164b;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f52163a;
        androidx.navigation.compose.n.b(navigation, "EcgReviewStatusScreen", null, null, null, null, null, null, new s1.a(true, -1054524390, new r9(nVar, wBS08EcgActivationActivity)), 126);
        xb.i.a(navigation, "PhoneNumberBottomSheet", null, new s1.a(true, 1281552445, new y9(nVar, wBS08EcgActivationActivity)), 6);
        return nm0.y.f85009a;
    }
}
