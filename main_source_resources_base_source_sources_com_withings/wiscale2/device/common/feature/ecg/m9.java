package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class m9 extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51522a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f51523b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(r8.n nVar, WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51522a = wBS08EcgActivationActivity;
        this.f51523b = nVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m navigation = mVar;
        kotlin.jvm.internal.u.j(navigation, "$this$navigation");
        r8.n nVar = this.f51523b;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51522a;
        androidx.navigation.compose.n.b(navigation, "FirstECGNeedsReview", null, null, null, null, null, null, new s1.a(true, -1125662874, new c9(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "HowToRecordAnECG", null, null, null, null, null, null, new s1.a(true, -1412856803, new f9(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "HeartbeatExplanations", null, null, null, null, null, null, new s1.a(true, -1526467298, new i9(nVar, wBS08EcgActivationActivity)), 126);
        androidx.navigation.compose.n.b(navigation, "ReviewExplanations", null, null, null, null, null, null, new s1.a(true, -1640077793, new l9(nVar, wBS08EcgActivationActivity)), 126);
        return nm0.y.f85009a;
    }
}
