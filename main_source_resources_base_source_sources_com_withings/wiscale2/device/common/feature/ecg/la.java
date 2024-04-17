package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class la extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51507a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51508b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51507a = wBS08EcgActivationActivity;
        this.f51508b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f51508b;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51507a;
        androidx.navigation.compose.n.b(navigation, "DiscoverECG6Lead", null, null, null, null, null, null, new s1.a(true, 1994422241, new ea(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "CanDetectAFib", null, null, null, null, null, null, new s1.a(true, 120011082, new ha(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "CannotDetectMedicalConditions", null, null, null, null, null, null, new s1.a(true, 1291219753, new ka(nVar, wBS08EcgActivationActivity)), 126);
        return nm0.y.f85009a;
    }
}
