package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class g3 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51361a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51362b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(r8.n nVar, EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51361a = ecgActivationActivity;
        this.f51362b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        EcgActivationActivity ecgActivationActivity = this.f51361a;
        androidx.navigation.compose.n.b(navigation, "EcgReviewStatusScreen", null, null, null, null, null, null, new s1.a(true, -962173774, new y2(ecgActivationActivity)), 126);
        xb.i.a(navigation, "PhoneNumberBottomSheet", null, new s1.a(true, -722642795, new f3(this.f51362b, ecgActivationActivity)), 6);
        return nm0.y.f85009a;
    }
}
